import shortBreak from "./shortbreak.js";
import longBreak from "./longbreak.js";
import setView from "./set-view.js";

export default function changeTimer(cycle, phaseStatus) {
  let phase;
  if(cycle < 4) {

    if(phaseStatus === 'pomodoro') {
      phase = 'shortBreak';
      shortBreak(phase);
    } else {
      phase = 'pomodoro';
      setView(phase);
    }
  }
  else if(cycle === '4') {
    phase = 'longBreak';
    longBreak(phase);
  } else setView();
}