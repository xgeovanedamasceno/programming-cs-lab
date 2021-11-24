import React from 'react';
import styled from 'styled-components';

const Wrapper = (props) => {
    return (
        <section className={ props.className }>
            <p>Hoje</p>
        </section>
    )
}

const StyledWrapper = styled(Wrapper)`
    background-color: #1D1F27;
    color: silver;
    margin: 0 auto;
    width: 800px;

`

export default StyledWrapper;