import { createAction } from "@reduxjs/toolkit";

export const increment = createAction('INCREMENT');
export const decrement = createAction('DECREMENT');
console.log(increment.type)

function counter(state = 0, action) {
    switch(action.type) {
      case increment.type:
        return state + 1;
      case decrement.type:
        return state - 1;  
      default:
        return state;
    }
}

export default counter;