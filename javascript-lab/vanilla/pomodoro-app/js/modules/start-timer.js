import { seconds } from "./objects/seconds.js";
import { idInterval } from "./objects/id-interval.js";
import stopTimer from './stoptimer.js'
import countProductivity from "./count-productivity.js";

export default function startTimer(timeMin, phase) {

  const timeMinutes = document.querySelector("#timeMinutes");
  const timeSeconds = document.querySelector("#timeSeconds");

  if(seconds.time == 3) { 
    timeMin--;
    seconds.time--;
  }

  let countTime = 0;

  idInterval.id = setInterval(() => {
    timeMinutes.innerHTML = timeMin;
    timeSeconds.innerHTML = seconds.time--; 
    if(seconds.time < 0) {
      seconds.time = 2; 
      timeMinutes.innerHTML = timeMin--;
      countTime++
      if(timeMin < 0) {
        stopTimer();
        countProductivity(countTime, phase);
      }
    }
  }, 1000);
}