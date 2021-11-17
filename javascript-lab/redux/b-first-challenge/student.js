// Constants
const INCREMENT_TIME = 'student/INCREMENT_TIME';
const DECREMENT_TIME = 'student/DECREMENT_TIME';
const MODIFY_EMAIL = 'student/MODIFY_EMAIL';

// Action Creator
export const incrementTime = () => ({ type: INCREMENT_TIME });
export const decrementTime = () => ({ type: DECREMENT_TIME });
export const modifyEmail = (email) => ({ type: MODIFY_EMAIL, payload: email });


// Initial State
const student = {
    name: 'André Rafael',
    email: 'andre@origamid.com',
    remainingDays: 120,
  };

const reducer = immer.produce((state, action) => {
    switch(action.type) {
        case INCREMENT_TIME:
            state.remainingDays += 1;
            break;
        case DECREMENT_TIME:
            state.remainingDays -= 1;
            break;
        case MODIFY_EMAIL:
            console.log(action.payload)
            state.email = action.payload;
            break;
    }
}, student);

export default reducer;