import { pomodoroSettings } from "./objects/pomodoro-settings.js";

export default function reset() {
  pomodoroSettings.cycle = 0;
  localStorage.setItem('cycle', pomodoroSettings.cycle);
}