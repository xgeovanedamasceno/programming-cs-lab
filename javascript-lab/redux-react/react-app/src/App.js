import React from "react";
import { useDispatch, useSelector } from "react-redux";
import { increment, decrement } from "./store/counter";

function App() {
  const state = useSelector(state => state.total);
  
  const dispatch = useDispatch();


  return (
    <div>
     <h1>React Redux App</h1>
     <h2>Total: {state}</h2>
     <button onClick={() => dispatch(increment())}>Increment</button>
     <button onClick={() => dispatch(decrement())}>Decrement</button>

    </div>
  );
}


export default App;
