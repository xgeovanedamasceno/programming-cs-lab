import student from './student.js'
import lessons from './lessons.js'

const reducer = Redux.combineReducers({ student, lessons });

const store = Redux.createStore(
    reducer,
    window.__REDUX_DEVTOOLS_EXTENSION__ && window.__REDUX_DEVTOOLS_EXTENSION__()
)

export default store;