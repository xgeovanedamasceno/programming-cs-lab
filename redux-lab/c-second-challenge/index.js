import { postFetch } from "./token.js";

const b1 = document.querySelector('#do-fetch').addEventListener('click', store.dispatch(postFetch))
console.log(b1);