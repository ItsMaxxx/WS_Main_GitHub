// --- Skins Logic ---
//Skins Button und Dropdown
const skinsBtn = document.getElementById('skinsBtn');
const skinsMenu = document.getElementById('skinsMenu');

//Skin Auswahl Buttons
const skinStandardBtn = document.getElementById('skinStandardBtn');
const skinWhiteBtn = document.getElementById('skinWhiteBtn');

//
let normalImg = '../images/redNORMAL-Photoroom.png';
let happyImg = '../images/redHAPPY-Photoroom.png';
let sadImg = '../images/redSAD-Photoroom.png';
const whiteNormalImg = '../images/whiteNORMAL-Photoroom.png';
const whiteHappyImg = '../images/whiteHAPPY-Photoroom.png';
const whiteSadImg = '../images/whiteSAD-Photoroom.png';
let skin = 'standard';

skinsBtn.addEventListener('click', () => {
    const expanded = skinsBtn.getAttribute('aria-expanded') === 'true';
    skinsBtn.setAttribute('aria-expanded', String(!expanded));
    if (!expanded) {
        skinsMenu.removeAttribute('hidden');
    } else {
        skinsMenu.setAttribute('hidden', '');
    }
});
document.addEventListener('click', (e) => {
    if (!skinsBtn.contains(e.target) && !skinsMenu.contains(e.target)) {
        skinsMenu.setAttribute('hidden', '');
        skinsBtn.setAttribute('aria-expanded', 'false');
    }
});
skinStandardBtn.addEventListener('click', () => {
    skin = 'standard';
    normalImg = '../images/redNORMAL-Photoroom.png';
    happyImg = '../images/redHAPPY-Photoroom.png';
    sadImg = '../images/redSAD-Photoroom.png';
    setMascot(normalImg);
    skinsMenu.setAttribute('hidden', '');
    skinsBtn.setAttribute('aria-expanded', 'false');
});
skinWhiteBtn.addEventListener('click', () => {
    skin = 'white';
    normalImg = whiteNormalImg;
    happyImg = whiteHappyImg;
    sadImg = whiteSadImg;
    setMascot(normalImg);
    skinsMenu.setAttribute('hidden', '');
    skinsBtn.setAttribute('aria-expanded', 'false');
});

// --- Slot Logic ---
const symbols = ['D', 'H', 'B', 'W', '♠'];
const reelCount = 4;
const stopDelay = [1200, 1600, 2000, 2600];     //Animationsdauern der Slot in ms
const visible = 3;            //Anzahl sichtbare Symbole am Ende des Spins pro Spalte
const symbolHeight = 64;
const knobMin = 0;
const knobMax = 90;             //maximale Pixelbewegung des Knopfes des Hebels nach unten
const knobStart = knobMin;      //Startposition des Knopfes des Hebels
let balance = 1000;             //Startkapital
let currentBet = 10;            //Mindesteinsatz
let isSpinning = false;
const headerBalanceAmount = document.getElementById('headerBalanceAmount');         //Coinstand aus Header
const betDisp = document.getElementById('coinsDisplay');                            //Feld des momentanen Einsatz
const mascotImage = document.getElementById('mascotImage');
const fadeDuration = 100;            //Millisekunden an Animationsübergang

function updateBalance() {
    headerBalanceAmount.textContent = balance;
}
function updateBet() {
    betDisp.textContent = `Einsatz: ${currentBet}`;
}

//Funktion sorgt dafür, dass man nicht mehr setzen kann als man hat
document.querySelectorAll('.coin-btn').forEach((btn) => {
    btn.addEventListener('click', function () {
        let change = parseInt(btn.getAttribute('data-change'), 10);
        currentBet = Math.max(10, Math.min(balance, currentBet + change));
        updateBet();
    });
});
updateBalance();
updateBet();

//erstellt slot spalte und dessen Inhalt
function createReel(reelElem, symbol, resultSet) {
    const strip = document.createElement('div');
    strip.className = 'reel-strip';
    const limitedSymbols = ['D', 'D', 'D', 'H', 'H', 'H', 'B', 'B', 'B', 'W', 'W', 'W', '♠',];
    for (let i = limitedSymbols.length - 1; i > 0; i--) {
        const j = Math.floor(Math.random() * (i + 1));                          //Randomisierer
        [limitedSymbols[i], limitedSymbols[j]] = [limitedSymbols[j], limitedSymbols[i]];   //Swap Elemente damit zuffälig
    }
    limitedSymbols.forEach((sym) => {
        const reelSymbol = document.createElement('div');           //gibt allen Symbolen kontext
        reelSymbol.className = 'reel-symbol';
        reelSymbol.textContent = sym;
        strip.appendChild(reelSymbol);
    });
    if (resultSet && Array.isArray(resultSet)) {
        for (let i = 0; i < visible; i++) {
            const reelSymbol = document.createElement('div');
            reelSymbol.className = 'reel-symbol';
            reelSymbol.textContent = resultSet[i];                                      //speichert sichtbare Ergebnisse, damit sie ausgwertet werden können
            strip.appendChild(reelSymbol);
        }
    }
    reelElem.innerHTML = '';
    reelElem.appendChild(strip);
    const maxStartIndex = Math.max(0, limitedSymbols.length - visible);
    const startIndex = Math.floor(Math.random() * (maxStartIndex + 1));
    const offset = startIndex * symbolHeight;
    strip.style.top = `-${offset}px`;
}

function evaluateWin(resultMatrix) {
    const visible = 3;
    function symbolsMatch(a, b) {
        return a === b || a === '♠' || b === '♠';
    }
    for (let row = 0; row < visible; row++) {
        const combo = [
            resultMatrix[0][row],
            resultMatrix[1][row],
            resultMatrix[2][row],
            resultMatrix[3][row],
        ];
        const dhbwCombo = ['D', 'H', 'B', 'W'];
        let jackpot = true;
        for (let i = 0; i < 4; i++) {
            if (!symbolsMatch(combo[i], dhbwCombo[i])) {
                jackpot = false;
                break;
            }
        }
        if (jackpot) return { win: true, type: 'DHBW', multiplier: 25 };
        let baseSymbol = combo.find((s) => s !== '♠');
        if (baseSymbol && combo.every((sym) => symbolsMatch(sym, baseSymbol))) {
            return { win: true, type: 'QUAD', multiplier: 10 };
        }
    }
    return { win: false };
}
function spinReel(reelElem, results, duration, onFinish) {
    const strip = reelElem.querySelector('.reel-strip');
    const limitedSymbols = ['D', 'D', 'H', 'H', 'B', 'B', 'W', 'W', '♠'];
    const totalSymbols = limitedSymbols.length + visible;
    const totalHeight = strip.scrollHeight - visible * symbolHeight;
    const easeOutCubic = (x) => 1 - Math.pow(1 - x, 3);
    const startTime = performance.now();
    function animate(currentTime) {
        const elapsed = currentTime - startTime;
        const progress = Math.min(elapsed / duration, 1);
        const easedProgress = easeOutCubic(progress);
        const currentOffset = easedProgress * totalHeight;
        strip.style.top = `-${currentOffset}px`;
        if (progress < 1) {
            requestAnimationFrame(animate);
        } else {
            const allSymbols = strip.querySelectorAll('.reel-symbol');
            for (let i = 0; i < visible; i++) {
                allSymbols[allSymbols.length - visible + i].textContent = results[i];
            }
            if (onFinish) onFinish();
        }
    }
    requestAnimationFrame(animate);
}
function createConfetti(x, y) {
    for (let i = 0; i < 30; i++) {
        const confetti = document.createElement('div');
        confetti.className = 'confetti';
        confetti.style.left = x - 5 + Math.random() * 10 + 'px';
        confetti.style.top = y + 'px';
        confetti.style.background = ['#ffd700', '#ff6b6b', '#4ecdc4', '#95e1d3'][
            Math.floor(Math.random() * 4)
            ];
        document.body.appendChild(confetti);
        setTimeout(() => confetti.remove(), 3000);
    }
}
function setMascot(imageFile) {
    mascotImage.classList.add('fade-out');
    setTimeout(() => {
        mascotImage.src = imageFile;
        mascotImage.classList.remove('fade-out');
        mascotImage.classList.add('fade-in');
        setTimeout(() => mascotImage.classList.remove('fade-in'), fadeDuration);
    }, fadeDuration);
}
function showResult(result) {
    const resultArea = document.getElementById('resultArea');
    if (result.win) {
        setMascot(happyImg);
        const winAmount = currentBet * result.multiplier;
        balance += winAmount;
        updateBalance();
        if (result.type === 'DHBW') {
            resultArea.innerHTML = `🎉 JACKPOT! 🎉<span class="multiplier">+${winAmount}</span>`;
            createConfetti(window.innerWidth / 2, window.innerHeight / 2);
        } else {
            resultArea.innerHTML = `✨ GEWONNEN! ✨<span class="multiplier">+${winAmount}</span>`;
        }
        resultArea.className = 'result-area win';
    } else {
        setMascot(sadImg);
        resultArea.textContent = 'Nächstes Mal! 💪';
        resultArea.className = 'result-area lose';
    }
}
for (let i = 0; i < reelCount; i++) {
    let limitedSymbols = ['D', 'D', 'H', 'H', 'B', 'B', 'W', 'W', '♠'];
    for (let j = limitedSymbols.length - 1; j > 0; j--) {
        const k = Math.floor(Math.random() * (j + 1));
        [limitedSymbols[j], limitedSymbols[k]] = [limitedSymbols[k], limitedSymbols[j]];
    }
    let startIdx = Math.floor(Math.random() * (limitedSymbols.length - visible + 1));
    const randomSymbols = limitedSymbols.slice(startIdx, startIdx + visible);
    createReel(document.getElementById('reel' + i), symbols[0], randomSymbols);
}
const leverKnob = document.getElementById('leverKnob');
let isDragging = false,
    startY = 0,
    dragOffset = 0;
leverKnob.addEventListener('mousedown', startDrag);
leverKnob.addEventListener('touchstart', function (e) {
    startDrag(e.touches[0]);
});
function startDrag(e) {
    if (isDragging || isSpinning) return;
    isDragging = true;
    startY = e.clientY || e.pageY;
    dragOffset = 0;
    leverKnob.classList.add('lever-pull');
    document.body.style.cursor = 'grabbing';
    window.addEventListener('mousemove', dragHandle);
    window.addEventListener('touchmove', touchDragHandle, { passive: false });
    window.addEventListener('mouseup', stopDrag);
    window.addEventListener('touchend', stopDrag);
}
function dragHandle(e) {
    moveKnob(e.clientY);
}
function touchDragHandle(e) {
    e.preventDefault();
    moveKnob(e.touches[0].clientY);
}
function moveKnob(currentY) {
    const dy = Math.min(knobMax, Math.max(knobMin, currentY - startY));
    dragOffset = dy;
    leverKnob.style.top = knobStart + dy + 'px';
}
function stopDrag() {
    if (!isDragging) return;
    isDragging = false;
    leverKnob.classList.remove('lever-pull');
    document.body.style.cursor = '';
    window.removeEventListener('mousemove', dragHandle);
    window.removeEventListener('mouseup', stopDrag);
    window.removeEventListener('touchmove', touchDragHandle);
    window.removeEventListener('touchend', stopDrag);

    if (dragOffset > 60 && balance >= currentBet && !isSpinning) {
        leverKnob.style.top = knobStart + knobMax + 'px';
        setTimeout(() => {
            resetKnob();
            startSpin();
        }, 180);
    } else {
        resetKnob();
    }
}
function resetKnob() {
    leverKnob.style.top = knobStart + 'px';
}
function startSpin() {
    setMascot(normalImg); // Normales Wikinger-Bild für Start
    if (balance < currentBet) {
        document.getElementById('resultArea').textContent = '❌ Nicht genug Guthaben!';
        return;
    }
    isSpinning = true;
    balance -= currentBet;
    updateBalance();

    let resultsMatrix = [[], [], [], []];
    let finished = 0;

    for (let i = 0; i < reelCount; i++) {
        let reelElem = document.getElementById('reel' + i);

        let limitedSymbols = ['D', 'D', 'H', 'H', 'B', 'B', 'W', 'W', '♠'];

        for (let j = limitedSymbols.length - 1; j > 0; j--) {
            const k = Math.floor(Math.random() * (j + 1));
            [limitedSymbols[j], limitedSymbols[k]] = [limitedSymbols[k], limitedSymbols[j]];
        }

        let startIdx = Math.floor(Math.random() * (limitedSymbols.length - visible + 1));
        let results = limitedSymbols.slice(startIdx, startIdx + visible);

        for (let row = 0; row < visible; row++) {
            resultsMatrix[i][row] = results[row];
        }
        createReel(reelElem, symbols[0], results);
        setTimeout(function () {
            spinReel(reelElem, results, stopDelay[i], function () {
                finished++;
                if (finished === reelCount) {
                    const result = evaluateWin(resultsMatrix);
                    showResult(result);
                    isSpinning = false;
                }
            });
        }, i * 200);
    }
    const resultArea = document.getElementById('resultArea');
    resultArea.textContent = '🎲 Spinning...';
    resultArea.className = 'result-area spinning-text';
}