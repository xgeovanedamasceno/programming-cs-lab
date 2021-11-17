import { pomodoroSettings } from "./objects/pomodoro-settings.js";
import setProductivityView from "./set-productivity-view.js";

export default function countProductivity(countTime, phase) {
  if(phase === 'pomodoro') {
    pomodoroSettings.sumActiveProductivity(countTime);
    localStorage.setItem('activeProductivity', pomodoroSettings.activeProductivity);
  } else {
    pomodoroSettings.sumPassiveProductivity(countTime);
    localStorage.setItem('passiveProductivity', pomodoroSettings.passiveProductivity);
  }
  setProductivityView();
}