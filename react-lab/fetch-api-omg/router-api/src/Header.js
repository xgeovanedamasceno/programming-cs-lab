import React from 'react'
import { useLocation } from 'react-router'
import Navbar from './Navbar'
import styled from 'styled-components'


const Header = ( {title} ) => {
    const StyledHeader = styled.header`
        width: 100%;    
    `
    const location = useLocation();

    React.useEffect(() => {
        console.log('mudou a rota')
    }, [location])

    return (
        <StyledHeader>
            <h1>{title}</h1>
        </StyledHeader>
    )
}

export default Header
