export default function setProductivityView() {
  const activeHours = document.querySelector('#activeHours');
  const activeMinutes = document.querySelector('#activeMinutes');
  const passiveHours = document.querySelector('#passiveHours');
  const passiveMinutes = document.querySelector('#passiveMinutes');

  const activeTime = localStorage.getItem('activeProductivity');
  const passiveTime = localStorage.getItem('passiveProductivity');

  const activeResult = Math.trunc(activeTime / 60);
  const passiveResult = Math.trunc(passiveTime / 60);


  if(activeResult <= 0) {
    activeHours.innerHTML = 0;
    activeMinutes.innerHTML = activeTime % 60;
  }
  else {
    activeHours.innerHTML = Math.trunc(activeTime / 60);
    activeMinutes.innerHTML = activeTime % 60;
  }

  if(passiveResult <= 0) {
    passiveHours.innerHTML = 0;
    passiveMinutes.innerHTML = passiveTime % 60;
  }
  else {
    passiveHours.innerHTML = Math.trunc(passiveTime / 60);
    passiveMinutes.innerHTML = passiveTime % 60;
  }

  
  

}