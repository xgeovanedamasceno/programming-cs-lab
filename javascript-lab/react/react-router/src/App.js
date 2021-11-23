import React from 'react';
import Header from './Header';
import { BrowserRouter, Routes, Route } from 'react-router-dom';
import Home from './Home';
import About from './About';
import NotFound from './NotFound'
import Login from './Login';
import Product from './Product';

function App() {
    
  return (
    <BrowserRouter>
      <Header />
      <Routes>
        <Route path="/" element={<Home/>}/>
        <Route path="about" element={<About/>}/>
        <Route path="*" element={<NotFound/>}/>
        <Route path="login" element={<Login/>}/>
        <Route path="product/:id" element={<Product/>}/>
      </Routes>
    </BrowserRouter>
  );
}

export default App;
