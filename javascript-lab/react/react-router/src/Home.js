import React from 'react';
import { Link } from 'react-router-dom';

const Home = () => {
    return (
        <div>
            <h1>Home</h1>
            <p>Hello there. Welcome!</p>
            <Link to="product/notebook">Notebook</Link>
            {' '} | {' '}
            <Link to="product/smartphone">Smartphone</Link>
        </div>
    )
}

export default Home;