function reducer(state = 0, action) {
    console.log('reducer')
    switch (action.type) {
        case 'INCREMENT':
            return state + 1;
        case 'DECREMENT':
            return state - 1;
        default:
            return state;
    }
}

const logger = (store) => (next) => (action) => {
    console.group(action.type);
    console.log('ACTION', action);
    
    console.log(`PREV_STATE: `, store.getState());
    const result = next(action)
    console.log(`NEW_STATE: `, store.getState());
    console.groupEnd();
    return result;
}



const { applyMiddleware, compose } = Redux;

const composeEnhancers = window.__REDUX_DEVTOOLS_EXTENSION_COMPOSE__ || compose;

const enhancer = composeEnhancers(applyMiddleware(logger));


const store = Redux.createStore(reducer, enhancer);

/* console.log(store.getState()); */

store.dispatch({ type: 'INCREMENT'})
store.dispatch({ type: 'INCREMENT'})

store.dispatch({ type: 'INCREMENT'})

store.dispatch({ type: 'INCREMENT'})
store.dispatch({ type: 'DECREMENT'})















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