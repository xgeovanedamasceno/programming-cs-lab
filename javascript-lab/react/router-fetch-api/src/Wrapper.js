import React from 'react';
import styled from 'styled-components';

const Wrapper = (props) => {
    return (
        <section className={ props.className }>
            
        </section>
    )
}

const StyledWrapper = styled(Wrapper)`
    border: 2px solid grey;
    color: silver;
    margin: 0 auto;
    width: 800px;
    height: 1000px;

`

export default StyledWrapper;