function reducer(state = 0, action) {
    switch(action.type) {
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
    console.log('PREV_STATE', store.getState());
    const result = next(action);
    console.log('NEW_STATE', store.getState());
    console.groupEnd();
    return result;
}


const { compose, applyMiddleware } = Redux;

const composeEnhancers = window.__REDUX_DEVTOOLS_EXTENSION_COMPOSE__ || compose;


const enhancer = composeEnhancers(applyMiddleware(logger));

const store = Redux.createStore(reducer, enhancer);



store.dispatch({type: 'INCREMENT'})
store.dispatch({type: 'INCREMENT'})
const action = store.dispatch({type: 'DECREMENT'})
console.log(action)
