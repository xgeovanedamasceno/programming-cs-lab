import React from "react";
import { useDispatch, useSelector } from "react-redux";
import { increment, decrement } from "./store/counter";
import { close, open } from "./store/modal";

function Counter() {
    const stateCounter = useSelector(state => state.counter.total);
    const stateModal = useSelector(state => state.modal)
    console.log(stateCounter)
    const dispatch = useDispatch();

    return (
        <>
        <div>
            <h2>Counter Modal</h2>
            {stateModal && <h3>Total: { stateCounter }</h3>}
            <button onClick={ () => dispatch(increment()) }>Increment</button>
            <button onClick={ () => dispatch(decrement()) }>Decrement</button>
            <button onClick={ () => dispatch(open()) }>Open Modal</button>
            <button onClick={ () => dispatch(close()) }>Close Modal</button>
        </div>
        </>
    )
}

export default Counter;