import { incrementTime, decrementTime, modifyEmail } from "./student.js";
import { lessons, completeLesson, completeCourse, resetCourse  } from "./lessons.js";
import store from "./configureStore.js";






function render() {
    const { student, lessons } = store.getState();
    console.log(lessons)
    
    const nameField = document.getElementById('name')
    const emailField = document.getElementById('email')
    const daysInfo = document.getElementById('days-info')
    nameField.value = student.name;
    emailField.value = student.email;
    daysInfo.innerHTML = 'Remaining Days: ' + student.remainingDays;


   
    const completeLessons = document.getElementById('total-lessons');
    console.log(completeLessons)

   

    
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


const ulElement = document.createElement('ul');

const lessonsSection = document.getElementById('lessons')

lessons.forEach(item => {
    let liElement = document.createElement('li');
    liElement.innerHTML = `
        Lesson: ${item.name} - Status: ${item.complete ? 'complete' : 'incomplete'} 
        <button id=${item.id}>Complete Lesson</button><br><br>`
    ulElement.appendChild(liElement);
})

lessonsSection.appendChild(ulElement);

store.dispatch(completeLesson(2));

