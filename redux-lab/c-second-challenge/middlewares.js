export const thunk = (store) => (next) => (action) => {
    if (typeof action === 'function') {
        console.log(store.dispatch)
        return action(store.dispatch)
    } 

    return next(action);
}

export const localStorage = (store) => (next) => (action) => {
    if (action.localStorage !== undefined ) {
        window.localStorage.setItem(action.localStorage, JSON.stringify(action.payload))
    }
    return next(action)
}
