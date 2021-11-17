import React from "react";
import { connect } from "react-redux";

const increment = () => ({ type: 'INCREMENT'})


function App({ counter, increment }) {
  


  return (
    <div>
     <h1>React Redux App</h1>
     <h2>Total: {counter}</h2>
     <button onClick={increment}>Increment</button>
    </div>
  );
}

const mapStateToProps = (state) => {
  return { counter: state }
}

const mapDispatchToProps = {
  increment
}

export default connect(mapStateToProps, mapDispatchToProps)(App);
