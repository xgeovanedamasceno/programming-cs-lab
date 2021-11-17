import React from "react";
import { useDispatch } from "react-redux";
import { fetchToken } from "./store/login";

const FormLogin = () => {
    const [ username, setUsername ] = React.useState('');
    const [ password, setPassword ] = React.useState('');

    const dispatch = useDispatch()
    

    function handleSubmit(event) {
        event.preventDefault();
        dispatch(fetchToken({username, password}));
    }

    return (
    <>
    <form onSubmit={handleSubmit} style={{ marginTop: '20px'}}>
        <label htmlFor="username" style={ { display: 'block' }}>User</label>
        <input 
            type="text" 
            id="username" 
            value={username} 
            onChange={({ target }) => setUsername(target.value)}
        />
        <label htmlFor="password" style={ { display: 'block', marginTop: '10px' } }>Password</label>
        <input 
            type="password" 
            id="password"
            value={password}
            onChange={({ target }) => setPassword(target.value)}
        />
        <button style={ { display: 'block', marginTop: '10px' } }>Submit</button> 
    </form>
    </>
    )
}

export default FormLogin;