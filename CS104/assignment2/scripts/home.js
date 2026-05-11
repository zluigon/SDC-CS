const faqQuestions = document.querySelectorAll(".faq-question");

faqQuestions.forEach(function (questionButton) {
	questionButton.addEventListener("click", function () {
		const answerId = questionButton.getAttribute("aria-controls");
		const answer = document.getElementById(answerId);
		const isExpanded =
			questionButton.getAttribute("aria-expanded") === "true";

		questionButton.setAttribute("aria-expanded", String(!isExpanded));

		if (answer) {
			answer.hidden = isExpanded;
		}
	});
});
