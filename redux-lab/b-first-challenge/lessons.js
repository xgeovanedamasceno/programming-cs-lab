const COMPLETE_LESSON = 'aulas/COMPLETE_LESSON';
const COMPLET_COURSE = 'aulas/COMPLET_COURSE';
const RESET_COURSE = 'aulas/RESET_COURSE';

export const completeLesson =  (id) => ({ type: COMPLETE_LESSON, payload: id });
export const completeCourse =  () => ({ type: COMPLET_COURSE });
export const resetCourse = () => ( { type: RESET_COURSE });

export const lessons = [
    {
      id: 1,
      name: 'Design',
      complete: true,
    },
    {
      id: 2,
      name: 'HTML',
      complete: false,
    },
    {
      id: 3,
      name: 'CSS',
      complete: false,
    },
    {
      id: 4,
      name: 'JavaScript',
      complete: false,
    },
  ];
  

const lessonsReducer = (state = lessons, action) => {
    let newState;
    switch(action.type) {
        case COMPLETE_LESSON:
          state.forEach(item => {
            if (item.id === action.payload) {
              item.complete = true;
            }
          })
          newState = [...state];
          return newState;
        case COMPLET_COURSE:
          state.forEach( item => item.complete = true )
          newState = [...state];
          return newState;
        case RESET_COURSE:
          state.forEach(item => item.complete = false )
          newState = [...state];
          return newState;
        default:
          return state;
    }
}

export default lessonsReducer;