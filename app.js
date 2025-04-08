<script>
    const toggleSwitch = document.getElementById('toggleSwitch');
    const body = document.body;
    const modeLabel = document.getElementById('modeLabel');

    toggleSwitch.addEventListener('change', () ={">"} {
      body.classList.toggle('dark-mode')}""
      modeLabel.textContent = body.classList.contains('dark-mode') ? 'Dark Mode' : 'Light Mode';
    {"}"});
  </script>
