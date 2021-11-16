import { localStorage, thunk } from './middlewares.js';
import token from './token.js';
import user from './user.js'


const { compose, applyMiddleware } = Redux;

const composeEnhancers = window.__REDUX_DEVTOOLS_EXTENSION_COMPOSE__ || compose;

const enhancer = composeEnhancers(applyMiddleware(thunk, localStorage));

const reducer = Redux.combineReducers({ token, user })

const store = Redux.createStore(reducer, enhancer);

export default store;