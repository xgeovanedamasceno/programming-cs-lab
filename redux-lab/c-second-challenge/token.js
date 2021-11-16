//Constants
const FETCH_STARTED = 'token/FETCH_STARTED';
const FETCH_SUCCESS = 'token/FETCH_SUCCESS';
const FETCH_ERROR =  'token/FETCH_ERROR';


//Action Creators
const startFetch = () => ({ type: FETCH_STARTED });
const successFetch = (token) => ({type: FETCH_SUCCESS, payload: token });
const errorFetch = () => ({ type: FETCH_ERROR });

//Initial State
const initialState = {
    loading: false,
    token: null,
    error: null
}

const reducer = immer.produce((state, action) => {
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
     
    if (typeof action === 'function') return action(store.dispatch)

    return next(action);
}

const { compose, applyMiddleware } = Redux;

const composeEnhancers = window.__REDUX_DEVTOOLS_EXTENSION_COMPOSE__ || compose;

const enhancer = composeEnhancers(applyMiddleware(thunk));

const store = Redux.createStore(reducer, enhancer);






export function postFetch(url, user) {
   return async (dispatch) => {
       try {
           dispatch(startFetch())
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
         dispatch(successFetch(token));
       } catch (error) {
           console.log('postFetch try');
           dispatch(errorFetch())
       }
   }
    
}

const url = 'https://dogsapi.origamid.dev/json/jwt-auth/v1/token';
const user = {
    username: 'dog',
    password: 'dog'
}
const urlUser = 'https://dogsapi.origamid.dev/json/api/user';

const state = store.getState();
if ( state.token === null ) store.dispatch(postFetch(url, user))
else store.dispatch(fetchUser(urlUser))
