import { incrementTime, decrementTime, modifyEmail } from "./student.js";
import { lessons, completeLesson, completeCourse, resetCourse  } from "./lessons.js";
import store from "./configureStore.js";


const ulElement = document.createElement('ul');

const lessonsSection = document.getElementById('lessons')

lessons.forEach(item => {
    let liElement = document.createElement('li');
    liElement.innerHTML = `
        Lesson: ${item.name} - <span id=${item.id}>Status: ${item.complete ? 'complete' : 'incomplete'}</span> 
        <button class=${item.id}>Complete Lesson</button><br><br>`
    ulElement.appendChild(liElement);
    
})

lessonsSection.appendChild(ulElement);


function render() {
    const { student, lessons } = store.getState();
    
    const nameField = document.getElementById('name')
    const emailField = document.getElementById('email')
    const daysInfo = document.getElementById('days-info')
    nameField.value = student.name;
    emailField.value = student.email;
    daysInfo.innerHTML = 'Remaining Days: ' + student.remainingDays;
   
    const completeLessons = document.getElementById('total-lessons');


    lessons.forEach(lesson => {
        let statusLesson = document.getElementById(`${lesson.id}`)
        statusLesson.innerHTML = `Status: ${lesson.complete ? 'Complete' : 'Incomplete'}`        
    })

    
   

    
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



let buttonsLessons = document.querySelectorAll('#lessons button')
buttonsLessons = Array.from(buttonsLessons)
buttonsLessons.forEach(btn => {
    let id = parseInt(btn.getAttribute('class'))
    btn.addEventListener('click', () => store.dispatch(completeLesson(id)))
})

