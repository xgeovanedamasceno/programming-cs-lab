import React from "react";
import { useDispatch, useSelector } from "react-redux";
import { login } from "./store/login";

const FormLogin = () => {
    const [ username, setUsername ] = React.useState('');
    const [ password, setPassword ] = React.useState('');

    const dispatch = useDispatch()

    const { data } = useSelector((state) => state.login.user)
    
    

    function handleSubmit(event) {
        event.preventDefault();
        dispatch(login({username, password}));
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
        <p>{data?.email}</p>
    </form>
    </>
    )
}

export default FormLogin;