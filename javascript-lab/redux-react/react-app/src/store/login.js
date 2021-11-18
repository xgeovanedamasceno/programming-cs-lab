import { combineReducers } from "@reduxjs/toolkit";

import createAsyncSlice from "./helper/createAsyncSlice";

const token = createAsyncSlice({
    name: 'token',
    reducers: {
        fetchSuccess: {
            reducer(state, action) {
                state.loading = false;
                state.data = action.payload
                state.error = null;
            },
            prepare(payload) {
                return {
                    payload,
                    meta: {
                        localStorage: {
                            key: 'token',
                            value: payload.token
                        },
                    },
                }
            }
        },
    },
    fetchConfig: (userPayload) => ({
        url: 'https://dogsapi.origamid.dev/json/jwt-auth/v1/token',
        options: {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json' 
            },
            body: JSON.stringify(userPayload),
        },
    })
});

const user = createAsyncSlice({
    name: 'user',
    fetchConfig: (tokenPayload) => ({
        url: 'https://dogsapi.origamid.dev/json/api/user',
        options: {
            method: 'GET',
            headers: {
                'Authorization': 'Bearer '  + tokenPayload,
            },
        },
    })
});


const reducer = combineReducers({ token: token.reducer, user: user.reducer})

const fetchToken = token.asyncAction;
const fetchUser = user.asyncAction;

export const login = (user) => async (dispatch) => {
    try {
        const { payload } = await dispatch(fetchToken(user))
        if (payload.token !== undefined) {
            await dispatch(fetchUser(payload.token))
        }
    } catch (error) {

    }
}

export default reducer;








