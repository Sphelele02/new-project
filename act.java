// script.js

const toggleButton = document.getElementById('mode-toggle');
const body = document.body;

// Check if the user has a preference stored in localStorage
if (localStorage.getItem('theme') === 'dark') {
    body.setAttribute('data-theme', 'dark');
    toggleButton.textContent = 'Switch to Light Mode';
} else {
    body.setAttribute('data-theme', 'light');
    toggleButton.textContent = 'Switch to Dark Mode';
}

// Toggle dark/light mode when the button is clicked
toggleButton.addEventListener('click', () => {
    if (body.getAttribute('data-theme') === 'dark') {
        body.setAttribute('data-theme', 'light');
        toggleButton.textContent = 'Switch to Dark Mode';
        localStorage.setItem('theme', 'light'); // Save the user's preference
    } else {
        body.setAttribute('data-theme', 'dark');
        toggleButton.textContent = 'Switch to Light Mode';
        localStorage.setItem('theme', 'dark'); // Save the user's preference
    }
});



