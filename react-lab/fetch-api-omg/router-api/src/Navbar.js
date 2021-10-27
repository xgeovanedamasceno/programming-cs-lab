import React from 'react'
import { NavLink } from 'react-router-dom'
import './Link.css'


const Navbar = () => {
  

    return (
        <nav>
{/*             <Link to="/" >Home</Link> {' '}
            {' '} */}
            <NavLink to="products-page">Products</NavLink>{' '}
            {' '}
            <NavLink to="contact-page">Contact</NavLink>{' '}
            {' '}
        </nav>
    )
}

export default Navbar
