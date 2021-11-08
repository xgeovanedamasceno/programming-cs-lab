const COMPLET_CLASS = 'aulas/COMPLET_CLASS';
const COMPLET_COURSE = 'aulas/COMPLET_COURSE';
const RESET_COURSE = 'aulas/RESET_COURSE';

export const completeClass =  () => ({ type: COMPLET_CLASS });
export const completeCourse =  () => ({ type: COMPLET_COURSE });
export const resetCourse = () => ( { type: RESET_COURSE });

const classes = [
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
  

const reducerClasses = (state = classes, action) => {
    switch(action.type) {
        case COMPLET_CLASS:
            state.class = action.payload;
            return state;
        case COMPLET_COURSE:
            state.course = action.payload;
            return state;
        case RESET_COURSE:
            state.course = action.payload;
            return state;
        default:
            return state;
    }
}

export default reducerClasses;