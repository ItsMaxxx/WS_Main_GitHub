// --- Login form helpers (append to main.js or put into login.js) ---
(function(){
    const form = document.getElementById('loginForm');
    const showPwBtn = document.querySelector('.show-pw');
    const passwordInput = document.getElementById('password');
    const loginBtn = document.getElementById('loginBtn');
    const formMessage = document.getElementById('formMessage');

    // Show/hide password
    if (showPwBtn && passwordInput) {
        showPwBtn.addEventListener('click', () => {
            const isHidden = passwordInput.type === 'password';
            passwordInput.type = isHidden ? 'text' : 'password';
            showPwBtn.setAttribute('aria-pressed', String(isHidden));
            showPwBtn.title = isHidden ? 'Passwort verbergen' : 'Passwort anzeigen';
        });
    }

    // Minimal client-side validation + simulated submit
    form.addEventListener('submit', async (ev) => {
        ev.preventDefault();
        formMessage.textContent = '';
        const username = document.getElementById('username').value.trim();
        const password = passwordInput.value;

        if (!username) { formMessage.textContent = 'Bitte Benutzername oder E-Mail eingeben.'; return; }
        if (!password || password.length < 4) { formMessage.textContent = 'Bitte gültiges Passwort eingeben.'; return; }

        // Simulate a login delay
        loginBtn.disabled = true;
        loginBtn.textContent = 'Prüfe…';
        await new Promise(r => setTimeout(r, 700));

        // Demo: akzeptiere "demo" als Benutzer und any Passwort >=4
        if (username.toLowerCase() === 'demo' || username.includes('@')) {
            formMessage.style.color = '#b7ffd2';
            formMessage.textContent = 'Erfolgreich eingeloggt (Demo).';
            // hier würdest du z.B. local login state setzen oder showPage('game')
            // Beispiel: zeige Game-Seite nach Login
            showPage('game');
        } else {
            formMessage.style.color = '#ffd7d7';
            formMessage.textContent = 'Login fehlgeschlagen. Bitte prüfen.';
        }

        loginBtn.disabled = false;
        loginBtn.textContent = 'Anmelden';
    });
})();
