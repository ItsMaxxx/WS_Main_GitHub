
// register.js

(function(){
    const form = document.getElementById('registerForm');
    const msg = document.getElementById('registerMessage');
    const cancelBtn = document.getElementById('registerCancelBtn');

    // wenn Cancel -> zurück zur Login-Page
    if (cancelBtn) cancelBtn.addEventListener('click', () => showPage('login'));

    // Wenn Signup-Button in Login benutzt wird, öffne Register (falls ID vorhanden)
    const signupBtn = document.getElementById('signupBtn');
    if (signupBtn) signupBtn.addEventListener('click', (e) => {
        e.preventDefault();
        showPage('register');
        // Fokus auf erstes Feld
        setTimeout(() => document.getElementById('reg_username')?.focus(), 10);
    });

    // Helper: einfache E-Mail-Regel
    function isEmail(v) {
        return /\S+@\S+\.\S+/.test(v);
    }

    async function saveUserToDb(userObj) {
        // Wenn Dexie 'db' vorhanden und users store existiert -> speichern
        if (window.db && db.users) {
            try {
                const id = await db.users.add(userObj);
                // auch stats anlegen (falls table vorhanden)
                if (db.stats) await db.stats.put({ userId: id, totalSpins: 0, totalWins: 0, totalLosses: 0 });
                return { ok: true, id };
            } catch (err) {
                return { ok: false, error: err.message || String(err) };
            }
        } else {
            // Fallback: localStorage (nur demo)
            try {
                const store = JSON.parse(localStorage.getItem('local_users') || '[]');
                // prüfen ob email oder username schon existiert
                if (store.some(u => u.email === userObj.email || u.username === userObj.username)) {
                    return { ok: false, error: 'Benutzername oder E-Mail bereits vorhanden.' };
                }
                userObj.id = Date.now();
                store.push(userObj);
                localStorage.setItem('local_users', JSON.stringify(store));
                // optional: set demo user id as current user
                localStorage.setItem('currentUserId', String(userObj.id));
                return { ok: true, id: userObj.id };
            } catch (err) {
                return { ok: false, error: 'Speichern fehlgeschlagen.' };
            }
        }
    }

    if (!form) return;

    form.addEventListener('submit', async (ev) => {
        ev.preventDefault();
        msg.textContent = '';
        msg.style.color = '';

        const username = document.getElementById('reg_username').value.trim();
        const email = document.getElementById('reg_email').value.trim();
        const password = document.getElementById('reg_password').value;
        const confirm = document.getElementById('reg_confirm').value;
        const birth = document.getElementById('reg_birth').value || null;
        const initial = Number(document.getElementById('reg_initial').value || 0);
        const terms = document.getElementById('reg_terms').checked;

        // Validation
        if (!username) { msg.textContent = 'Bitte Benutzername eingeben.'; return; }
        if (!email || !isEmail(email)) { msg.textContent = 'Bitte gültige E-Mail eingeben.'; return; }
        if (!password || password.length < 8) { msg.textContent = 'Passwort mind. 8 Zeichen.'; return; }
        if (password !== confirm) { msg.textContent = 'Passwörter stimmen nicht überein.'; return; }
        if (!terms) { msg.textContent = 'Bitte AGB akzeptieren.'; return; }

        // Bereite Objekt vor (passwort im Demo-Fall im Klartext, in echter App: Hashen!)
        const userObj = {
            username,
            email,
            passwordHash: password, // HINWEIS: in Produktion niemals Klartext speichern — nur Demo!
            coinBalance: initial || 0,
            moneyBalance: 0.00,
            createdAt: new Date().toISOString()
        };

        // Speichern
        const res = await saveUserToDb(userObj);
        if (!res.ok) {
            msg.style.color = '#ffd7d7';
            msg.textContent = res.error || 'Registrierung fehlgeschlagen.';
            return;
        }

        msg.style.color = '#b7ffd2';
        msg.textContent = 'Registrierung erfolgreich — du wirst zur Anmeldung weitergeleitet.';
        // Kurze Verzögerung, dann zur Login-Seite zurück
        setTimeout(() => {
            // Optional: Prefill login username
            const uInput = document.getElementById('username');
            if (uInput) uInput.value = username;
            showPage('login');
        }, 900);
    });

})();
