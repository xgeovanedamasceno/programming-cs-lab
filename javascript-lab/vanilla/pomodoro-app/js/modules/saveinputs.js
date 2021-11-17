import saveSettings from "./save-pomodoro-settings.js";
import setView from "./set-view.js";

export default function saveInputs(event) {
  event.preventDefault();
  saveSettings();
}
