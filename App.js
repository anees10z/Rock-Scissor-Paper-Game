let imageBtn = document.querySelectorAll(".images");
let restart = document.querySelector("#reset-btn");
let gameResult = document.querySelector("#message");
let botChoice = document.querySelector("#botChoice");
let score = document.getElementById("score");

let playGame = true;

let win = 0;
let lose = 0;
let draw = 0;

let options = [
  ["Draw", "Lose", "Win"],
  ["Win", "Draw", "Lose"],
  ["Lose", "Win", "Draw"],
];

let elements = ["Rock", "Paper", "Scissors"];

restart.classList.add("hide");
gameResult.classList.add("hide");
botChoice.classList.add("hide");

// game starts here
for (const btn of imageBtn) {
  btn.addEventListener("click", function (e) {
    if (!playGame) return;
    let userOption = parseInt(e.target.getAttribute("id"));
    winCheck(userOption);
  });
}

// win check function
function winCheck(userOption) {
  let randomOption = Math.floor(Math.random() * 3);
  let res = options[userOption][randomOption];
  scoreBoardUpdate(res);
  score.innerHTML = `Win = ${win}  Lose = ${lose}  Draw = ${draw}`;
  gameResult.innerHTML = res;
  botChoice.innerHTML = `Bot choice: ${elements[randomOption]}`;
  restart.classList.remove("hide");
  gameResult.classList.remove("hide");
  botChoice.classList.remove("hide");
  playGame = false;
}
restart.addEventListener("click", function () {
  gameResult.innerHTML = "";
  playGame = true;
  restart.classList.add("hide");
  gameResult.classList.add("hide");
  botChoice.classList.add("hide");
  gameResult.classList.remove("win");
  gameResult.classList.remove("lose");
  gameResult.classList.remove("draw");
});

function scoreBoardUpdate(res) {
  if (res == "Win") {
    win++;
    gameResult.classList.add("win");
  } else if (res == "Lose") {
    lose++;
    gameResult.classList.add("lose");
  } else {
    draw++;
    gameResult.classList.add("draw");
  }
}
