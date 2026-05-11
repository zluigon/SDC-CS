const navToggle = document.querySelector(".nav-toggle");
const navLinks = document.getElementById("nav-links");

navToggle.addEventListener("click", function () {
	const expanded = this.getAttribute("aria-expanded") === "true";
	this.setAttribute("aria-expanded", String(!expanded));
	navLinks.classList.toggle("open");
});

const contactForm = document.querySelector(".contact form");

if (contactForm) {
	contactForm.addEventListener("submit", function (event) {
		event.preventDefault();

		const formData = new FormData(contactForm);
		const submission = {
			name: formData.get("name"),
			email: formData.get("email"),
			message: formData.get("message"),
		};

		alert(
			`Thank you for your message, ${submission.name}! We will get back to you at ${submission.email}.`,
		);
		contactForm.reset();
	});
}
