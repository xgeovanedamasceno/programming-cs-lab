import { createSlice } from "@reduxjs/toolkit";


const slice = createSlice({
    name: 'counter',
    initialState: {
        total: 0,
    },
    reducers: {
        increment(state) {
            state.total++;
        },
        decrement(state) {
            state.total--;
        },
        sum: {
            reducer(state, action) {
                state.total += action.payload;
            },
            prepare(payload) { 
                return { payload, meta: 'local'};
            }
        }
    }
})


export const { increment, decrement, sum } = slice.actions;
export default slice.reducer;