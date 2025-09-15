
/* Logik für das Umschalten zwischen den Pages*/
function showPage(page) {
    const pages = document.querySelectorAll('.login-page, .register-page, .shop-page, .game-page');
    pages.forEach(p => p.classList.add('hidden'));
    if (page === 'login') document.querySelector('.login-page').classList.remove('hidden');
    if (page === 'register') document.querySelector('.register-page').classList.remove('hidden');
    if (page === 'shop')  document.querySelector('.shop-page').classList.remove('hidden');
    if (page === 'game')  document.querySelector('.game-page').classList.remove('hidden');
}
document.addEventListener('DOMContentLoaded', () => showPage('login'));
