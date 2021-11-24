import { BrowserRouter, Routes, Route } from "react-router-dom";
import StyledHeader from "./Header";
import Home from "./Home";
import Products from "./Products";







function App() {
  return (
    <BrowserRouter>
      <StyledHeader/>
      <Routes>
        <Route path="/" element={<Home/>} />
        <Route path="products" element={<Products/>} />
      </Routes>
    </BrowserRouter>

  );
}

export default App;
