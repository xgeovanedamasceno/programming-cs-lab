import { createUser } from './token.js'
import store from './configureStore.js';
import { getUser } from './user.js';

const url = 'https://dogsapi.origamid.dev/json/jwt-auth/v1/token';
const userData = {
    username: 'dog',
    password: 'dog'
}

const urlUser = 'https://dogsapi.origamid.dev/json/api/user';

const b1 = document.querySelector('#do-fetch').addEventListener('click', () => {
    const { token , user } = store.getState();
    if (token.token === null) {
        console.log('if  click')
        store.dispatch(createUser(url, userData))
        store.dispatch(getUser(urlUser));
    } else {
        console.log('else click');
        store.dispatch(getUser(urlUser));

    }
    
})