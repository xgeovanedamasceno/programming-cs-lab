export const pomodoroSettings = {
  pomodoro: 5,
  shortBreak: 3,
  longBreak: 4,
  cycle: 0,
  phase: false,
  pauseStatus: false,
  activeProductivity: 0,
  passiveProductivity: 0,
    
  pomodoroTime(value) {
    this.pomodoro = value;
  },
  
  shortBreakTime(value) {
    this.shortBreak = value;
  },
  
  longBreakTime(value) {
    this.longBreak = value;
  },

  setPauseStatus(value) {
    this.pauseStatus = value;
  },

  sumActiveProductivity(value) {
    this.activeProductivity += value;
  },
  
  sumPassiveProductivity(value) {
    this.passiveProductivity += value;
  }
}
