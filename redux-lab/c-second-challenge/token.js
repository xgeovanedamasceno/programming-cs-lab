//Constants
const FETCH_STARTED = 'token/FETCH_STARTED';
const FETCH_SUCCESS = 'token/FETCH_SUCCESS';
const FETCH_ERROR =  'token/FETCH_ERROR';

//Initial State
const initialState = {
    loading: false,
    token: null,
    error: null
}

const reducer = immer.produce((state, action) => {
    console.log(action.type)
    switch(action.type) {
        case FETCH_STARTED:
            state.loading = true;
            break;
        case FETCH_SUCCESS:
            state.token = action.payload;
            break;
        case FETCH_ERROR:
            state.error = action.payload;
            break;
    }
}, initialState);



// code without immer
/* const reducer = (state = initialState, action) => {
    console.log('reducer')
    console.log(action.type)
    switch(action.type) {
        case FETCH_STARTED:
            return { ...state, loading: true }
        case FETCH_SUCCESS:
            return { loading: false, token: action.payload, error: null}
        case FETCH_ERROR:
            return { ...state, error: action.payload}
        default:
            return state;
    }
}; */



const thunk = (store) => (next) => (action) => {
    console.log(store.getState());
    console.log(typeof action)
    
    if (typeof action === 'function')  {
        console.log('if')
        return action(store.dispatch)
    }
    return next(action);
}

const { compose, applyMiddleware } = Redux;

const composeEnhancers = window.__REDUX_DEVTOOLS_EXTENSION_COMPOSE__ || compose;

const enhancer = composeEnhancers(applyMiddleware(thunk));

export const store = Redux.createStore(reducer, enhancer);




const url = 'https://dogsapi.origamid.dev/json/jwt-auth/v1/token';
const user = {
    username: 'dog',
    password: 'dog'
}

export function postFetch(url, user) {
   return async (dispatch) => {
       try {
        console.log('postFetch try');
           dispatch({type: FETCH_STARTED })
           const response = await fetch(
            url,
            {
              method: 'POST',
              headers: {
                'Content-Type': 'application/json',
              },
              body: JSON.stringify(user),
            },
          );
          const { token } = await response.json();
         dispatch({ type: FETCH_SUCCESS, payload: token});
       } catch (error) {
           console.log('postFetch try');
           dispatch({ type: FETCH_ERROR, payload: error.message })
       }
   }
    
}

/* store.dispatch(postFetch(url, user)) */

