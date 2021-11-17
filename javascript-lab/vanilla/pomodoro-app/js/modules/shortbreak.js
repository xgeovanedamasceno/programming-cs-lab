import setView from "./set-view.js";
import startShortTimer from "./startshort-timer.js";

export default function shortBreak(phase) {

  const startButton = document.querySelector("#startTimer");

  setView(phase);
  startButton.addEventListener('click', startShortTimer);
  
}