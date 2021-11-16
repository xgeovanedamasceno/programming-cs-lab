import token from './token.js'
import { postFetch } from './token.js'
import store from './configureStore.js';

const url = 'https://dogsapi.origamid.dev/json/jwt-auth/v1/token';
const user = {
    username: 'dog',
    password: 'dog'
}
const urlUser = 'https://dogsapi.origamid.dev/json/api/user';

const b1 = document.querySelector('#do-fetch').addEventListener('click', () => {
    console.log('click')
    store.dispatch(postFetch(url, user))
})