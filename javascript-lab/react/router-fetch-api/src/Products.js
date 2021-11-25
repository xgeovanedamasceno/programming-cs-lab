import React from 'react';
import { Routes, useLocation } from 'react-router';
import { Link } from 'react-router-dom';
import './App.css'

const Products = () => {
    const [products, setProducts] = React.useState(null);
        
    const { pathname } = useLocation();
        
    React.useEffect(() => {
        fetch('https://ranekapi.origamid.dev/json/api/produto')
            .then(response => response.json())
            .then(json => setProducts(json));
    }, [pathname])

    
    return (
        <section className="container-photos">
    
            {products?.map(item => (
                <div key={item.id}>
                    <Link to={item.id}>
                        <img className="photo" alt={ item.fotos[0].titulo }src={ item.fotos[0].src }/>
                    </Link>
                </div>
            ))}
        </section>
     
    )
    
}

export default Products;