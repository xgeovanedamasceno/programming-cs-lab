import React from 'react'
import { Link } from 'react-router-dom';
import Head from './Head';

const ProductsPage = () => {

    const [products, setProducts] = React.useState(null)

    React.useEffect(() => {
        fetch('https://ranekapi.origamid.dev/json/api/produto')
        .then(response => response.json())
        .then(jsonproducts => setProducts(jsonproducts));
    }, [])

    if ( products === null ) return null

    console.log(products[0].id)

    return (
        <section>
            <Head title="Products" description="This is a product page"/>
           <ul style={{width: '700px', display: 'flex', flexWrap: 'wrap'}}>
               {products.map(product => (
                   <Link to={product.id} key={product.id}  style={{flex: '2 1 auto', textDecoration: 'none', color: '#444'}}>
                   <img style={{margin: '10px', width: '200px', height: '250px'}} src={product.fotos[0].src} />
                   <div style={{margin: '10px'}}>{product.nome}</div>
                   </Link>
               ))}
           </ul>
        </section>
    )
}

export default ProductsPage
