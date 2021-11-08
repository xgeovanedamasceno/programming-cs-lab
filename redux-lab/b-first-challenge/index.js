import { incrementTime, decrementTime } from "./student.js";
import store from "./configureStore.js";

function render() {
    const { student } = store.getState();
    
    const nameField = document.getElementById('name')
    const emailField = document.getElementById('email')
    const daysInfo = document.getElementById('days-info')
    nameField.value = student.name;
    emailField.value = student.email;
    daysInfo.innerHTML = 'Remaining Days: ' + student.remainingDays; 
}

render();
