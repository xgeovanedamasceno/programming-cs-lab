const initialState = {
    loading: false,
    data: null,
    error: null
}

function reducer(state = null, action) {
    switch (action.type) {
        case 'FETCH_STARTED':
            return { ...state, loading: true }
        case 'FETCH_SUCCESS':
            return { data: action.payload, loading: false, error: null }
        case 'FETCH_ERROR':
            return { data: null, loading: false, error: action.payload}
        default:
            return state;
    }
}

const thunk = (store) => (next) => (action) => {
    if (typeof action === 'function') {
        return action(store.dispatch, store.getState);
    }
    console.log(action)
    return next(action);
}



const { applyMiddleware, compose } = Redux;
const composeEnhancers = window.__REDUX_DEVTOOLS_EXTENSION_COMPOSE__ || compose;
const enhancer = composeEnhancers(applyMiddleware(thunk));
const store = Redux.createStore(reducer, enhancer);

function fetchUrl(url) {
    return async (dispatch) =>  {
        try {
            dispatch({ type: 'FETCH_STARTED' })
            const data = await fetch(url).then(r => r.json())
            dispatch({ type: 'FETCH_SUCCESS', payload: data})
        } catch (error) {
            dispatch({ type: 'FETCH_ERROR', payload: error.message})
        }
    }
}
store.dispatch(fetchUrl('https://dogsapi.origamid.dev/json/api/photo'))

/* fetchUrl(store.dispatch, 'https://dogsapi.origamid.dev/json/api/photo'); */













/* const FETCH_STARTED = 'token/FETCH_STARTED';
const FETCH_SUCCESS = 'token/FETCH_SUCCESS';
const FETCH_ERROR = 'token/FETCH_ERROR';

export const startFetch = () => ({ type: FETCH_STARTED });
export const successFetch = () => ({ type: FETCH_SUCCESS });
export const errorFetch = () => ( { type: FETCH_ERROR });

function reducer = immer.produce(state, action) {
    switch(actio.type) {

    }

} */