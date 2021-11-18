import { configureStore, combineReducers } from '@reduxjs/toolkit';
import counter from './counter';
import modal from './modal';
import login from './login';
import localStorage from './middlewares/localStorage'

/* import logger from './middlewares/logger' */

const reducer = combineReducers({counter, modal, login })
const store = configureStore({ 
  reducer, 
  middleware: (getDefaultMiddleware) => [ 
    ...getDefaultMiddleware(),
    localStorage,
   
  ]
});

export default store;