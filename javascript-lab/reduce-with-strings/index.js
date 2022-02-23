const words = ['hi', 'hello', 'parallelepiped']

const biggestWord = words.reduce((biggestWord, currentWord) => {
  if(currentWord.length > biggestWord.length) {
    return currentWord;
  }

  return biggestWord;
}, '')

console.log(biggestWord);