import React from "react";
import { useDispatch, useSelector } from "react-redux";
import { increment, decrement } from "./store/counter";
import { close, open } from "./store/modal";

function App() {
  const stateCounter = useSelector(state => state.counter.total);
  const stateModal = useSelector(state => state.modal)
  console.log(stateCounter)
  const dispatch = useDispatch();


  return (
    <div>
     <h1>React Redux App</h1>
     {stateModal && <h2>Total: {stateCounter}</h2>}
     
     <button onClick={ () => dispatch(increment()) }>Increment</button>
     <button onClick={ () => dispatch(decrement()) }>Decrement</button>
     <button onClick={ () => dispatch(open()) }>Open Modal</button>
     <button onClick={ () => dispatch(close()) }>Close Modal</button>

    </div>
  );
}


export default App;
