const numbers = [10,20,30,40,50];

const total = numbers.reduce((acc, item) => {
  return acc + item;
});

console.log(total);