import React from "react";
import { useDispatch, useSelector } from "react-redux";


function App() {
  const state = useSelector(state => state);
  const dispatch = useDispatch();

  return (
    <div>
     <h1>React Redux App</h1>
     <h2>Total: {state}</h2>
     <button onClick={() => dispatch({type: 'INCREMENT'})}>Increment</button>
    </div>
  );
}

export default App;
