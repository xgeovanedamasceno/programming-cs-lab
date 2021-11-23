import React from 'react'
import { NavLink, useLocation } from 'react-router-dom'

const Header = () => {
    const location = useLocation();

    React.useEffect(() => {
        console.log('change route')
    }, [location]);

    
    return (
        <header>
            <nav>
                <NavLink to="/" end activeStyle={{ color: "tomato" }}>Home</NavLink>
                {' '} | {' '}
                <NavLink to="about" activeStyle={{ color: "tomato" }}>About</NavLink>
                {' '} | {' '}
                <NavLink to="login" activeStyle={{ color: "tomato" }}>Login</NavLink>
            </nav>
        </header>
    )
}

export default Header;