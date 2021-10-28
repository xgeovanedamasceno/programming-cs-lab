import React from 'react'
import { BrowserRouter, Routes, Route } from 'react-router-dom';
import ContactPage from './ContactPage';


import Header from './Header';
import HomePage from './HomePage';
import Navbar from './Navbar';
import NotFound from './NotFound';
import ProductSinglePage from './ProductSinglePage';
import ProductsPage from './ProductsPage';


function App() {
  


  return (
    <BrowserRouter>
  
    <Header title="React Lab - Fetch API Origamid"/>
    <Navbar />
    <Routes>
      <Route path="/" element={<HomePage />} />
      <Route path="products-page" element={<ProductsPage />}/>
      <Route path="products-page/:id" element={<ProductSinglePage />} />
      <Route path="contact-page" element={<ContactPage />}/>
      <Route path="*" element={<NotFound />}/>
     </Routes> 
    </BrowserRouter>
  );
}

export default App;
