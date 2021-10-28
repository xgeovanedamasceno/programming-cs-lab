import React from 'react'
import { NavLink } from 'react-router-dom'
import './Link.css'
import styled from 'styled-components'

const StyledNavLink = styled(NavLink)`
    text-decoration: none;
    color: #fff;
    background-color: #444;
    padding: 5px 15px;
    border-radius: 5px;
    margin: 0 10px;

`


const Navbar = () => {
  

    return (
        <nav>
            <StyledNavLink to="products-page">Products</StyledNavLink>
            <StyledNavLink to="contact-page">Contact</StyledNavLink>
        </nav>
    )
}

export default Navbar
