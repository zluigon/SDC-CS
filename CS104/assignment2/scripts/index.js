const navToggle = document.querySelector(".nav-toggle");
const navLinks = document.getElementById("nav-links");

navToggle.addEventListener("click", function () {
	const expanded = this.getAttribute("aria-expanded") === "true";
	this.setAttribute("aria-expanded", String(!expanded));
	navLinks.classList.toggle("open");
});
