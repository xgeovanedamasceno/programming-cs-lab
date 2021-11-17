import { pomodoroSettings } from "./objects/pomodoro-settings.js";
import startTimer from "./start-timer.js";
import startPomodoro from "./start-pomodoro.js";

export default function startShortTimer() {
  
  const timeMinutes = document.querySelector("#timeMinutes");
  const startButton = document.querySelector("#startTimer");
  startButton.removeEventListener('click', startShortTimer);

  let time = timeMinutes.innerHTML;
  pomodoroSettings.phase = 'shortBreak';
  localStorage.setItem('phase', pomodoroSettings.phase);
  
  startTimer(time);
  startButton.addEventListener('click', startPomodoro);

}