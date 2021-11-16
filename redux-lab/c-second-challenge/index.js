import { createUser } from './token.js'
import store from './configureStore.js';
import { getUser } from './user.js';
import getLocalStorage from './getLocalStorage.js';

const url = 'https://dogsapi.origamid.dev/json/jwt-auth/v1/token';

const userData = {
    username: 'dog',
    password: 'dog'
}

const urlUser = 'https://dogsapi.origamid.dev/json/api/user';

document.querySelector('#do-fetch').addEventListener('click', () => {
    
    const { token } = store.getState();
    
    if (token.token === null) {
        store.dispatch(createUser(url, userData));
        store.dispatch(getUser(urlUser, token));
    } else {
        store.dispatch(getUser(urlUser));

    }
    
})