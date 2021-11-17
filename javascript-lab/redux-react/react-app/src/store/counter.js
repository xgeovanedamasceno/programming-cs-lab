import { createSlice } from "@reduxjs/toolkit";


const slice = createSlice({
    name: 'counter',
    initialState: {
        total: 0
    },
    reducers: {
        increment(state) {
            state.total++;
        },
        decrement(state) {
            state.total--;
        }
    }
})

console.log(slice)
export const { increment, decrement } = slice.actions;
export default slice.reducer;