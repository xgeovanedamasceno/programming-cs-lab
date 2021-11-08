const COMPLET_CLASS = 'aulas/COMPLETAR_AULA';
const COMPLET_COURSE = 'aulas/COMPLETAR_CURSO';
const RESET_COURSE = 'aulas/RESETAR_CURSO';

export const completeClass =  () => ({ type: COMPLET_CLASS });
export const completeCourse =  () => ({ type: COMPLET_COURSE });
export const resetCourse = () => ( { type: RESET_COURSE });

const initialState = {
    class: false,
    course: false,
    courseReset: false,
}

const reducerClass = (state = initialState, action) => {
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

export default reducerClass;