import { BrowserRouter, Routes, Route } from "react-router-dom";
import StyledHeader from "./Header";
import Home from "./Home";
import Product from "./Product";
import Products from "./Products";

function App() {
  return (
    <BrowserRouter>
      <StyledHeader/>
      <Routes>
        <Route path="/" element={<Home/>} />
        <Route path="products" element={<Products/>} />
        <Route path="products/:id/" element={<Product/>} />
      </Routes>
    </BrowserRouter>

  );
}

export default App;
