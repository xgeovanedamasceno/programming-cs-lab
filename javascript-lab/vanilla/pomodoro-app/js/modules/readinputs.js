import { pomodoroSettings } from "./objects/pomodoro-settings.js";

export default function readInputs(event) {
  const target = event.target;
  const name = target.name;
  const value = target.value;

  pomodoroSettings[name](value);

}