// Constants
const TIME_INCREMENT = 'student/TIME_INCREMENT';
const TIME_DECREMENT = 'student/TIME_DECREMENT';
const MOD_EMAIL = 'student/MODIFY_EMAIL';

// Action Creator
export const incrementTime = () => ({ type: TIME_INCREMENT });
export const decrementTime = () => ({ type: TIME_DECREMENT });
export const modifyEmail = () => ({ type: MOD_EMAIL });


// Initial State
const initialState = {
    time = 0,
    email = 'none'
}

const reduce = immer.produce((state, action) => {
    switch(action.type) {
        case TIME_INCREMENT:
            state.time = action.payload;
            break;
        case TIME_DECREMENT:
            state.time = action.payload;
            break;
        case MOD_EMAIL:
            state.email = action.payload;
            break;
    }
}, initialState);

export default reducer;