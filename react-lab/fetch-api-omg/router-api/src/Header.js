import React from 'react'
import { useLocation } from 'react-router'
import Navbar from './Navbar'

const Header = ( {title} ) => {
    const location = useLocation();

    React.useEffect(() => {
        console.log('mudou a rota')
    }, [location])
    
    return (
        <header>
            <h1>{title}</h1>
            <Navbar />
        </header>
    )
}

export default Header
