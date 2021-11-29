import React from "react";
import { NavLink } from "react-router-dom";
import '../App.css'

const Header = () => {


    const normalStyle = {
        backgroundColor: '#e6e6e6', 
        color: '#333333',
        marginRight: '5px',
        padding: '5px 15px',
        borderRadius: '5px',
        fontWeight: 'bold',
        fontFamily: 'monospace',
        fontSize: '18px',
        textDecoration: 'none',
    }

    const activeStyle = {
        backgroundColor: '#d9d9d9'
    }

    return (
        <nav className="container">
            <NavLink to="products" style={normalStyle} activeStyle={ activeStyle }>
                Products
            </NavLink>
            <NavLink to="contact" style={normalStyle} activeStyle={ activeStyle }>
                Contact
            </NavLink>
         
        </nav>
    )
}



export default Header;


