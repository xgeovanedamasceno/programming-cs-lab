const main = () => {
  let count = 0;
  let sum = 0;
  const primeNumbers = [];
  for(let i = 2; i <= 1000; i++) {
      for(let j = 1; j <= i; j++) {
        if (i % j === 0) {
         count++
        }
      }
      if(count === 2) {
        primeNumbers.push(i);
      }
      count = 0;
  }
  sum = primeNumbers.reduce((prev, curr) => prev + curr, sum)
  return sum;
}

console.log(main());