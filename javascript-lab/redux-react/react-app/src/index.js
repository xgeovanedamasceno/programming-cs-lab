import React from 'react';
import ReactDOM from 'react-dom';
import { Provider } from 'react-redux';
import { createStore } from 'redux';
import App from './App';



function reducer(state = 0, action) {
  switch(action.type) {
    case 'INCREMENT':
      return state + 1;
    default:
      return state;
  }
}

const store = createStore(reducer, window.__REDUX_DEVTOOLS_EXTENSION && window.__REDUX_DEVTOOLS_EXTENSION())


ReactDOM.render(
  <React.StrictMode>
    <Provider store={store}>
     <App/>
    </Provider>
  </React.StrictMode>,
  document.getElementById('root')
);

