const main = () => {
  let count = 0;
  let sum = 0;
  for(let i = 2; i <= 1000; i++) {
      for(let j = 1; j <= i; j++) {
        if (i % j === 0) {
         count++
        }
      }
      if(count === 2) {
        console.log(i)
        sum += i;
      }
      count = 0;
  }
  return sum;
}

console.log(main());