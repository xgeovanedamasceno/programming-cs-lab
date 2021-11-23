import React from 'react';
import { Link } from 'react-router-dom';
import Head from './Head';

const Home = () => {
    return (
        <div>
            <Head title="Home" description="Home Page"/>
            <h1>Home</h1>
            <p>Hello there. Welcome!</p>
            <Link to="product/notebook">Notebook</Link>
            {' '} | {' '}
            <Link to="product/smartphone">Smartphone</Link>
        </div>
    )
}

export default Home;