import setView from "./set-view.js";
import startLongTimer from "./startlong-timer.js";

export default function longBreak(phase) {
  const startButton = document.querySelector('#startTimer');

  setView(phase);
  startButton.addEventListener('click', startLongTimer);
  
}