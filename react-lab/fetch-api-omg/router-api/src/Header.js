import React from 'react'
import Navbar from './Navbar'

const Header = ( {title} ) => {
    return (
        <header>
            <h1>{title}</h1>
            <Navbar />
        </header>
    )
}

export default Header
