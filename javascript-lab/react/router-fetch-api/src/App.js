import { BrowserRouter, Routes, Route } from "react-router-dom";
import StyledHeader from "./Header";
import Home from "./Home";
import Contact from "./Contact";
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
        <Route path="contact"  element={<Contact/>} />
      </Routes>
    </BrowserRouter>

  );
}

export default App;
