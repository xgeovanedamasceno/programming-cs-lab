const initialState = {
    name: 'Geovane',
    age: 29,
}

const reducer = immer.produce((state, action) => {
    switch (action.type) {
        case 'CHANGE_NAME':
            state.name = action.payload;
            break;
        case 'CHANGE_AGE':
            state.age = action.payload;
    }
}, initialState);

const store = Redux.createStore(reducer, 
    window.__REDUX_DEVTOOLS_EXTENSION__ && window.__REDUX_DEVTOOLS_EXTENSION__())

store.dispatch( { type: 'CHANGE_NAME', payload: 'Charles'})
store.dispatch( { type: 'CHANGE_NAME', payload: 'Peter'})
store.dispatch( { type: 'CHANGE_NAME', payload: 'Xavier'})
store.dispatch( { type: 'CHANGE_AGE', payload: 31})

