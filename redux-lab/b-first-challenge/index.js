import { incrementTime, decrementTime, modifyEmail } from "./student.js";
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
store.subscribe(render);


const incrementButton =  document.getElementById('add');
const decrementButton = document.getElementById('rmv');
const editButton = document.getElementById('edit');
const emailInput = document.getElementById('email')


incrementButton.addEventListener('click', () => store.dispatch(incrementTime()))
decrementButton.addEventListener('click', () => store.dispatch(decrementTime()))
editButton.addEventListener('click', () => store.dispatch(modifyEmail(emailInput.value)))



