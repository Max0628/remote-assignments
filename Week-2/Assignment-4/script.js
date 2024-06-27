/*
Request 1: Click to Change Text.
When the user clicks on the "Welcome Message" block, change the text to "Have a Good Time!".
*/
const welcomeMsg = document.querySelector("header h1");
welcomeMsg.addEventListener("click", () => {
  welcomeMsg.textContent = `Have a Good Time!`;
});

/*
Request 2: Click to Show More Content Boxes.
There are some more content boxes waiting to show. When the user clicks the Call-to-Action button, show those hidden content boxes.
*/

const callToAction = document.querySelector("#button");
const showMoreBoxes = document.querySelector(".con2");
console.log(callToAction);
console.log(showMoreBoxes);
callToAction.addEventListener("click", () => {
  showMoreBoxes.style.display = "flex";
});
