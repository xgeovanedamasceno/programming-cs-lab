import { pomodoroSettings } from "./objects/pomodoro-settings.js";
import reset from "./reset.js";
import startPomodoro from "./start-pomodoro.js";
import startTimer from "./start-timer.js";


export default function startLongTimer() {
  
  const timeMinutes = document.querySelector("#timeMinutes");
  const startButton = document.querySelector("#startTimer");
  startButton.removeEventListener('click', startLongTimer);

  let time = timeMinutes.innerHTML;
  pomodoroSettings.phase = 'longBreak';
  localStorage.setItem('phase', pomodoroSettings.phase);

  reset();
  startButton.addEventListener('click', startPomodoro);
  startTimer(time);
  
}