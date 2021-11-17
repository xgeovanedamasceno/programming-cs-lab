import { pomodoroSettings } from "./objects/pomodoro-settings.js"
import startTimer from "./start-timer.js";

export default function startPomodoro() {

  const phase = 'pomodoro';
  const startButton = document.querySelector("#startTimer");
  const timeMinutes = document.querySelector("#timeMinutes");
  
  startButton.removeEventListener('click', startPomodoro); // pq ele estava +1 no ciclo

  pomodoroSettings.phase = 'pomodoro';
  localStorage.setItem('phase', pomodoroSettings.phase);
 
  
  
  let time =+ timeMinutes.innerHTML;
  const pauseStatus = localStorage.getItem('pauseStatus');
  if(pauseStatus == 'false') {
    pomodoroSettings.cycle += 1;
    localStorage.setItem('cycle', pomodoroSettings.cycle);
  }

  pomodoroSettings.setPauseStatus(false);
  localStorage.setItem('pauseStatus', pomodoroSettings.pauseStatus);
  startTimer(time, phase);
  
}