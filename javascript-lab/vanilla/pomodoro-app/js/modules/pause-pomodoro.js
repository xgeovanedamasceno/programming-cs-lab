import { idInterval } from "./objects/id-interval.js";
import { pomodoroSettings } from "./objects/pomodoro-settings.js";
import startPomodoro from "./start-pomodoro.js";
import startShortTimer from "./startshort-timer.js";
import startLongTimer from "./startlong-timer.js";


export default function pausePomodoro() {

  const startButton = document.querySelector("#startTimer");


  clearInterval(idInterval.id);
  pomodoroSettings.setPauseStatus(true);
  localStorage.setItem('pauseStatus', pomodoroSettings.pauseStatus);
  
  const phaseStatus = localStorage.getItem('phase');
  if(phaseStatus == 'pomodoro') {
    startButton.addEventListener('click', startPomodoro);
  }
  else if (phaseStatus == 'shortBreak') {
    startButton.removeEventListener('click', startPomodoro);
    startButton.addEventListener('click', startShortTimer);
  }
  else {
    startButton.removeEventListener('click', startPomodoro);
    startButton.addEventListener('click', startLongTimer);
  } 
}