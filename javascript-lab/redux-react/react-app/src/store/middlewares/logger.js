const logger = (store) => (next) => (action) => {
    console.group(action.type)
    console.log('ACTION', action);
    console.log('PREV_STATE', store.getState());
    const result = next(action);
    console.log('NEXT ACTION', action);
    console.log('result', result)
    console.log('NEW_STATE', store.getState());
    console.groupEnd();

    return result;
}

export default logger;