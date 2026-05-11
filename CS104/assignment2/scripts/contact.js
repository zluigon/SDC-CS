const contactForm = document.getElementById("contact-form");
const feedback = document.getElementById("form-feedback");

contactForm.addEventListener("submit", function (event) {
	event.preventDefault();

	const formData = new FormData(contactForm);
	const name = String(formData.get("name") || "").trim();
	const email = String(formData.get("email") || "").trim();
	const message = String(formData.get("message") || "").trim();

	const invalidFields = [];
	const emailPattern = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;

	const nameInput = document.getElementById("name");
	const emailInput = document.getElementById("email");
	const messageInput = document.getElementById("message");

	[nameInput, emailInput, messageInput].forEach(function (field) {
		if (field) {
			field.classList.remove("invalid");
		}
	});

	if (name.length < 2) {
		invalidFields.push(
			"Please enter a valid name (at least 2 characters).",
		);
		if (nameInput) {
			nameInput.classList.add("invalid");
		}
	}

	if (!emailPattern.test(email)) {
		invalidFields.push("Please enter a valid email address.");
		if (emailInput) {
			emailInput.classList.add("invalid");
		}
	}

	if (message.length < 10) {
		invalidFields.push("Message must be at least 10 characters long.");
		if (messageInput) {
			messageInput.classList.add("invalid");
		}
	}

	if (invalidFields.length > 0) {
		feedback.textContent = invalidFields.join(" ");
		feedback.classList.remove("success");
		feedback.classList.add("error");
		return;
	}

	feedback.textContent =
		"Thank you. Your message was submitted successfully.";
	feedback.classList.remove("error");
	feedback.classList.add("success");
	contactForm.reset();
});
