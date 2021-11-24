import { BrowserRouter, Routes, Route } from "react-router-dom";
import Home from "./Home";



import StyledWrapper from "./Wrapper";



function App() {
  return (
    <BrowserRouter>
      <StyledWrapper />
      <Routes>
        <Route to="/" element={<Home/>} />
      </Routes>
    </BrowserRouter>

  );
}

export default App;
