import { pomodoroSettings } from './objects/pomodoro-settings.js'
import changeTimer from './change-timer.js';
import setView from './set-view.js';
import { seconds } from './objects/seconds.js';

export default function checkCycle() {
  seconds.time = 3;
  if(pomodoroSettings.cycle > 0) { // falo diretamente com o objeto ou com o localStorage?
    let cycle = localStorage.getItem('cycle');
    let phaseStatus = localStorage.getItem('phase'); 
    changeTimer(cycle, phaseStatus);
  } else {
    setView();
  }
}