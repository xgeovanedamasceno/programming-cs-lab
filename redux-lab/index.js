 // constants
 const INCREMENT = 'INCREMENT'
 const SUM = 'SUM'
 const SUB = 'SUB'
 const initialState = 10;

 // Action Creators
 function increment() {
     return { type: INCREMENT }
 }

 function sum(payload) {
     return { type: SUM, payload }
 }

 function sub(payload) {
     return { type: SUB, payload }
 }

 
 function myCalc(state = initialState, action) {
     if (action.type === SUM) return state + action.payload
     if (action.type === SUB) return state - action.payload
     if (action.type === INCREMENT) return state + 1;
     return state;
 }

 function modal(state = true, action) {
    switch(action.type) {
        case 'OPEN':
            return true;
        case 'CLOSE':
            return false
        default:
            return state;
    }
}

 const reducer = Redux.combineReducers({myCalc, modal})

 const store = Redux.createStore(reducer);
 let state = store.getState();


 function render() {
     let { myCalc, modal} = store.getState();
     console.log(state)
     const total = document.getElementById('total');
     total.innerText = myCalc;

     if (modal) total.style.display = 'inline-block'
     else total.style.display = 'none'
 }
 render();
 

 const unsubscribe = store.subscribe(render)
 store.dispatch(sum(100))
 

 const button = document.getElementById('btn-action')
 button.addEventListener('click', () => store.dispatch(increment()));

 const openButton = document.getElementById('open')
 openButton.addEventListener('click', () => store.dispatch( { type: 'OPEN'}))

 const closeButton = document.getElementById('close')
 closeButton.addEventListener('click', () => store.dispatch({ type: 'CLOSE' }))

 
 /* store.dispatch(sum(10))
 store.dispatch(sum(10))
 store.dispatch(sub(10))
 store.dispatch(increment()) */