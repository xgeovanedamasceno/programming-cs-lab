import { pomodoroSettings } from './objects/pomodoro-settings.js'


export default function saveSettings() {
  localStorage.setItem('pomodoro', pomodoroSettings.pomodoro);
  localStorage.setItem('shortBreak', pomodoroSettings.shortBreak);
  localStorage.setItem('longBreak', pomodoroSettings.longBreak);
  localStorage.setItem('cycle', pomodoroSettings.cycle);
  localStorage.setItem('phase', pomodoroSettings.phase);
  localStorage.setItem('pauseStatus', pomodoroSettings.pauseStatus);
  localStorage.setItem('activeProductivity', pomodoroSettings.activeProductivity);
  localStorage.setItem('passiveProductivity', pomodoroSettings.passiveProductivity);
}