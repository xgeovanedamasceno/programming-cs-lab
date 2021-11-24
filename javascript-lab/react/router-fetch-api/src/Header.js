import React from "react";
import { NavLink } from "react-router-dom";
import styled from "styled-components";


const Header = () => {
    const normalStyle = {
        backgroundColor: '#e6e6e6', 
        color: '#333333',
        margin: '0px 5px',
        padding: '5px 15px',
        borderRadius: '5px',
        fontWeight: 'bold',
        textDecoration: 'none',
    }

    const activeStyle = {
        backgroundColor: '#d9d9d9'
    }

    return (
        <nav>
            <NavLink to="products" style={normalStyle} activeStyle={ activeStyle }>
                Products
            </NavLink>
            <NavLink to="contact" style={normalStyle} activeStyle={ activeStyle }>
                Contact
            </NavLink>
        </nav>
    )
}

const StyledeHeader = styled(Header)`
    margin: 20px 0;
    background-color: pink;
    width: 330px;
`

export default StyledeHeader;


