import { configureStore, combineReducers } from '@reduxjs/toolkit';
import counter from './counter';
import login from './login';
import modal from './modal';

/* import logger from './middlewares/logger' */

const reducer = combineReducers({counter, modal, login })
const store = configureStore({ 
  reducer, 
  middleware: (getDefaultMiddleware) => [ 
    ...getDefaultMiddleware()
  ]
});

export default store;