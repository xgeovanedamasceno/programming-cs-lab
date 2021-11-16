const FETCH_STARTED = 'user/FETCH_STARTED';
const FETCH_SUCCESS = 'user/FETCH_SUCCESS';
const FETCH_ERROR = 'user/FETCH_ERROR';

export const startFetch = () => ({ type: FETCH_STARTED });
export const successFetch = (dataUser) => ({ type: FETCH_SUCCESS, payload: dataUser });
export const errorFetch = (errorMessage) =>  ({ type: FETCH_ERROR, payload: errorMessage });

const initialState = {
    loading: false,
    data: null,
    error: null
}

const reducer = immer.produce((state, action) => {
    switch(action.type) {
        case FETCH_STARTED:
            state.loading = true;
            break;
        case FETCH_SUCCESS:
            state.loading = false,
            state.data = action.payload;
            break;
        case FETCH_ERROR:
            state.error = action.payload;
            break;
    }
}, initialState);

export default reducer;