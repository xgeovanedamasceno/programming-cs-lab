/* while (count !== 600){
    const sumBefore = 0
    for (let i = 0; i <= sumBefore; i++) {
        sumBefore = + i;
        console.log(sumBefore)
    }
}
console.log(count) */
/*let count = 0;
let sumBefore = 0;
let lastValueOfCount = 0;
for (let i = 1; lastValueOfCount <= 600; ) {
    sumBefore = i + sumBefore;
    i++;
    for (let j = 1; j <= sumBefore; j++) {
        if (sumBefore % j === 0) {
            count++
            if (count === 600) {
                console.log(count)
                break;
            }
            lastValueOfCount = count;
        } 
    }
    count = 0;
} */
/*let kcount = 0;
for (let k = 1; k <= 120; k++) {
    if (120 % k === 0) {
        kcount++
    }
}

console.log(kcount)*/
let i = 1;
let count = 0;
let sumBefore = 0;
let lastValueOfCount = 0;
while(count !== 600) {
    sumBefore += i;
    for (let j = 1; j <= sumBefore; j++)  {
        if (sumBefore % j === 0) {
            count++;   
        }
    }
    if (count !== 600) {
        count = 0;
    }
    i++;
}
console.log(count)