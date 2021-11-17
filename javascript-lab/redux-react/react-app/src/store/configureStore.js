import { configureStore, combineReducers } from '@reduxjs/toolkit';
import counter from './counter';
import modal from './modal';
import logger from './middlewares/logger'


const reducer = combineReducers({counter, modal })
const store = configureStore({ 
  reducer, 
  middleware: (getDefaultMiddleware) => [ 
    ...getDefaultMiddleware(), logger
  ]
});

export default store;