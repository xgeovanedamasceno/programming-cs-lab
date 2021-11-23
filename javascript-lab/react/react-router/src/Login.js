import React from 'react'
import { useNavigate } from 'react-router';

const Login = () => {

    const navigate = useNavigate();
    
    function doLogin() {
        navigate('/about')
    }

    return (
        <div>
            <button onClick={doLogin}>Enter</button>
        </div>
    )
}

export default Login;