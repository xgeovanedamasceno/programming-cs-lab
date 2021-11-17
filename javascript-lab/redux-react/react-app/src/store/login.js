import { createSlice } from "@reduxjs/toolkit";

const slice = createSlice({
    name: 'login',
    initialState: {
        loading: false,
        data: null,
        error: null
    },
    reducers: {
        fetchStarted(state) {
            state.loading = true;
        },
        fetchSuccess(state) {
            state.loading = false,
            state.data = action.payload,
            state.error = null
        },
        fetchError(state) {
            state.loading = false,
            state.error = action.payload
        },
    },
});

const { fetchStarted, fetchSuccess, fetchError } = slice.actions;

export const fetchToken = (user) => async (dispatch) => {
    try {
        dispatch(fetchStarted());
        const response = await fetch('https://dogsapi.origamid.dev/json/jwt-auth/v1/token', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json' 
            },
            body: JSON.stringify(user),
        });
        const data = await response.json();
        return dispatch(fetchSuccess(data));
    } catch (error) {
        return dispatch(fetchError(error.message))
    }
}

export default slice.reducer;