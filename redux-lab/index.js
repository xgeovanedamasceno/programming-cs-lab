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

 
 function reducer(state = initialState, action) {
     if (action.type === SUM) return state + action.payload
     if (action.type === SUB) return state - action.payload
     if (action.type === INCREMENT) return state + 1;
     return state;
 }

 const store = Redux.createStore(reducer);
 let state = store.getState();


 function render() {
     let state = store.getState();
     const total = document.getElementById('total');
     total.innerText = state;
 }
 render();
 

 const unsubscribe = store.subscribe(render)
 store.dispatch(sum(100))
 

 const button = document.getElementById('btn-action')
 button.addEventListener('click', () => store.dispatch(increment()));
 
 
 /* store.dispatch(sum(10))
 store.dispatch(sum(10))
 store.dispatch(sub(10))
 store.dispatch(increment()) */