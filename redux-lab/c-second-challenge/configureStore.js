import token from './token.js'

const reducer = Redux.combineReducers({token})

const thunk = (store) => (next) => (action) => {
     
    if (typeof action === 'function') return action(store.dispatch)

    return next(action);
}

const { compose, applyMiddleware } = Redux;

const composeEnhancers = window.__REDUX_DEVTOOLS_EXTENSION_COMPOSE__ || compose;

const enhancer = composeEnhancers(applyMiddleware(thunk));

const store = Redux.createStore(reducer, enhancer);

export default store;