import React from "react";
import { useLocation, useParams } from "react-router";

const Product = () => {
    const params = useParams();
    console.log(params)

    const location = useLocation();
    console.log(location)
    const search = new URLSearchParams(location.search);
    console.log(search.get('color'))
    console.log(search.get('brand'))


    return (
        <section>
            <h1>Product</h1>
        </section>
    )
}

export default Product;