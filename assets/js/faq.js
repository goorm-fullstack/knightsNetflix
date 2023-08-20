let faq = document.querySelectorAll('.q');

faq.forEach((element) => {
  element.addEventListener('click', function(e) {
    element.parentNode.classList.toggle('selected');
  });
});