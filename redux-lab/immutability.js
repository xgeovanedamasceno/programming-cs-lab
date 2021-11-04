const initialState = {
    name: 'Geovane',
    age: 29,
}

const reducer = (state = initialState, action) => {
    switch (action.type) {
        case 'CHANGE_NAME':
            return { ...state, name: action.payload};
        default:
            return state;

    }
}

const store = Redux.createStore(reducer, 
    window.__REDUX_DEVTOOLS_EXTENSION__ && window.__REDUX_DEVTOOLS_EXTENSION__())

store.dispatch( { type: 'CHANGE_NAME', payload: 'Charles'})
store.dispatch( { type: 'CHANGE_NAME', payload: 'Peter'})
store.dispatch( { type: 'CHANGE_NAME', payload: 'Xavier'})
