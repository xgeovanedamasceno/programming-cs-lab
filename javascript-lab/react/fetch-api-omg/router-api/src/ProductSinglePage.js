import React from "react";
import { useLocation, useParams } from "react-router-dom";



const ProductSinglePage = () => {
    const params = useParams();
    const location = useLocation();

    const [product, setProduct] = React.useState();

    React.useEffect(() => {
        fetch(`https://ranekapi.origamid.dev/json/api/produto/${params.id}`)
        .then(response => response.json())
        .then(dataJSON => setProduct(dataJSON));
    }, [params])

    console.log(product)

    if(product === null || product === undefined ) return null;

    return (
        <section style={{display: 'flex'}}>
          <img src={product.fotos[0].src} style={{margin: '10px', width: '300', height: '350px'}} />
          <span>
          <h2>{product.nome}</h2>
          <p>R$ {product.preco}</p>
          </span>
        </section>

    )
        
    
}

export default ProductSinglePage
