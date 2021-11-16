import token from './token.js';
import user from './user.js'

const reducer = Redux.combineReducers({ token, user })

const thunk = (store) => (next) => (action) => {
     
    if (typeof action === 'function') return action(store.dispatch)

    return next(action);
}

const { compose, applyMiddleware } = Redux;

const composeEnhancers = window.__REDUX_DEVTOOLS_EXTENSION_COMPOSE__ || compose;

const enhancer = composeEnhancers(applyMiddleware(thunk));

const store = Redux.createStore(reducer, enhancer);

export default store;