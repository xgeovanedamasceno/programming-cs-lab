import React, { useState } from 'react';
import { useLocation, useParams } from 'react-router';
import Head from './Head';
import styles from "./Product.module.css";


const Product = () => {

    const [product, setProduct] = useState(null);
    
    const { pathname } = useLocation();
    const { id } = useParams();

    React.useEffect(() => {
        fetch(`https://ranekapi.origamid.dev/json/api/produto/${id}`)
            .then(response => response.json())
            .then(json => setProduct(json))
    }, [pathname]);

    product?.fotos.forEach(item => console.log(item));

    return (
        <section className={styles.container}>
            <Head title="Product" description="Product Page"/>
            <div className={styles.containerPhotos}>
                { product?.fotos.map(item => (
                    <img className={styles.productPhoto} key={item.titulo} alt={item.titulo} src={item.src} />
                )) } 
            </div>
            <div className={styles.containerDescription}>
               <h2> { product?.nome }</h2>
               <p>$ {product?.preco }</p>
            </div>
        </section>
    )
}

export default Product;