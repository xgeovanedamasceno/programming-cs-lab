import { idInterval } from "./objects/id-interval.js";
import checkCycle from "./check-cycle.js";

export default function stopTimer() {
  clearInterval(idInterval.id);
  checkCycle();
}