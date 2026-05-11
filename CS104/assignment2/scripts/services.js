const galleryGrid = document.getElementById("gallery-grid");

const galleryItems = [
	{
		src: "images/803834f70033.png",
		alt: "Prepared buffet table with elegant catering setup",
	},
	{
		src: "images/1466978913421.png",
		alt: "Corporate lunch catering with assorted dishes",
	},
	{
		src: "images/1414235077428.png",
		alt: "Wedding reception dining setup with plated meals",
	},
	{
		src: "images/36766850.jpg",
		alt: "Chef preparing fresh food in a professional kitchen",
	},
	{
		src: "images/18541972.jpg",
		alt: "Group celebration dinner with catered food",
	},
	{
		src: "images/18749086.jpg",
		alt: "Decorated event table with catering dishes",
	},
];

const galleryFragment = document.createDocumentFragment();

galleryItems.forEach(function (item) {
	const figure = document.createElement("figure");
	figure.className = "gallery-card";

	const image = document.createElement("img");
	image.src = item.src;
	image.alt = item.alt;
	image.loading = "lazy";

	figure.append(image);
	galleryFragment.appendChild(figure);
});

galleryGrid.innerHTML = "";
galleryGrid.appendChild(galleryFragment);
