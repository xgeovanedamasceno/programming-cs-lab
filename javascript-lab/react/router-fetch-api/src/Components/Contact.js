import '../App.css'
import img from '../img/contato.jpg'
import React from 'react';
import styles from './Contact.module.css'
import Head from './Head';

const Contact = () => {
    return (
        <section className="container">
            <Head title="Contact" description="Contact Page"/>
            <div className={styles.container}>
                <div id="img">
                    <img className={styles.photo} src={img} alt="Contact Image" />
                </div>
                <div id={styles.description}>
                    <h3>Email</h3>
                    <p>xgeovanedamasceno@gmail.com</p>
                </div>
            </div>
        </section>
    )
}

export default Contact;