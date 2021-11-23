import React from "react";
import { Routes, Route, useLocation, useParams, Outlet } from "react-router";
import { NavLink } from "react-router-dom";


const Product = () => {
    const params = useParams();
    
    return (
        <section>
            <h3>Product: {params.id}</h3>
            <nav>
                <NavLink to="" end 
                    activeStyle={{ 
                        color: 'orange', 
                        fontWeight: 'bold', 
                        textDecoration: 'none' 
                    }}>
                Description</NavLink>
                {' '} | {' '}
                <NavLink to="review" activeStyle={{ color: 'orange', fontWeight: 'bold', textDecoration: 'none' }}>Review</NavLink>
                {' '} | {' '}
                <NavLink to="custom" activeStyle={{ color: 'orange', fontWeight: 'bold', textDecoration: 'none' }}>Custom</NavLink>
            </nav>
            <Outlet />
        </section>
    )
}

export default Product;