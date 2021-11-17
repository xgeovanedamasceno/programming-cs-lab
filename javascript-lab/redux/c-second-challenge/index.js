import { postUser } from './token.js'
import store from './configureStore.js';
import { getUser } from './user.js';
import getLocalStorage from './getLocalStorage.js';

const url = 'https://dogsapi.origamid.dev/json/jwt-auth/v1/token';

const userData = {
    username: 'dog',
    password: 'dog'
}

const urlUser = 'https://dogsapi.origamid.dev/json/api/user';

document.querySelector('#do-fetch').addEventListener('click', async () => {
    
    let { token } = store.getState();
    
    if (token.data === null) {
        /* store.dispatch(getUser(urlUser, await postUser(url, userData))) */

        await store.dispatch(postUser(url, userData)); //espera resolver para depois ir para a próxima linha
        let { token } = store.getState();
        console.log(token.data)
        store.dispatch(getUser(urlUser, token.data))
    } else {
        let { token } = store.getState()
        
        store.dispatch(getUser(urlUser, token.data))
    }
    
    
})