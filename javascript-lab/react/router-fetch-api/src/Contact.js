import "./App.css"
import img from './img/contato.jpg'
import React from 'react';

const Contact = () => {
    return (
        <section className="container">
            <div className="contact-container">
                <div id="img">
                    <img className="contact-photo" src={img} alt="Contact Image" />
                </div>
                <div id="description">
                    <h3>Email</h3>
                    <p>xgeovanedamasceno@gmail.com</p>
                </div>
            </div>
        </section>
    )
}

export default Contact;