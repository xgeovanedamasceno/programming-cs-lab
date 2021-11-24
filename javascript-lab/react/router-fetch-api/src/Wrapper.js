import React from 'react';
import styled from 'styled-components';
import StyledHeader from './Header';
import Home from './Home';




const Wrapper = (props) => {
    return (
        <section className={ props.className }>
            <StyledHeader />
            <Home />
        </section>
    )
}

const StyledWrapper = styled(Wrapper)`
    color: silver;
    margin: 40px auto;
    width: 800px;
`

export default StyledWrapper;