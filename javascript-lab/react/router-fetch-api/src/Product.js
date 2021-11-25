import "./App.css"
import React, { useState } from 'react';
import { useLocation, useParams } from 'react-router';

const Product = () => {

    const [product, setProduct] = useState(null);

    console.log(product)

    
    const { pathname } = useLocation();
    const { id } = useParams();

  

    React.useEffect(() => {
        fetch(`https://ranekapi.origamid.dev/json/api/produto/${id}`)
            .then(response => response.json())
            .then(json => setProduct(json))
    }, [pathname]);

    product?.fotos.forEach(item => console.log(item));

    return (
        <section className="container-product">
            <div className="container-photo">
                { product?.fotos.map(item => (
                    <img className="product-photo" key={item.titulo} alt={item.titulo} src={item.src} />
                )) } 
            </div>
            <div className="container-description">
               <h2> { product?.nome }</h2>
               <p> $ {product?.preco }</p>
            </div>
        </section>
    )
}

export default Product;