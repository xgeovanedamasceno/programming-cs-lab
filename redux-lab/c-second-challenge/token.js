//Constants
const FETCH_STARTED = 'token/FETCH_STARTED';
const FETCH_SUCCESS = 'token/FETCH_SUCCESS';
const FETCH_ERROR =  'token/FETCH_ERROR';


//Action Creators
export const startFetch = () => ({ type: FETCH_STARTED });
export const successFetch = (token) => ({type: FETCH_SUCCESS, payload: token });
export const errorFetch = () => ({ type: FETCH_ERROR });

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

export default reducer;

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


export function postFetch(url, user) {
    console.log('post click')
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