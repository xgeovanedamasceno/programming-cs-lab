import React from 'react';
import styled from 'styled-components';
import Header from './Header';

const Wrapper = (props) => {
    return (
        <section className={ props.className }>
            <Header />
        </section>
    )
}

const StyledWrapper = styled(Wrapper)`
    color: silver;
    margin: 40px auto;
    width: 800px;
    height: 1000px;
`

export default StyledWrapper;