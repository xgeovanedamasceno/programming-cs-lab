import { BrowserRouter, Routes, Route } from "react-router-dom";
import Header from "./Components/Header";
import Home from "./Components/Home";
import Contact from "./Components/Contact";
import Product from "./Components/Product";
import Products from "./Components/Products";

function App() {
  return (
    <BrowserRouter>
      <Header/>
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
