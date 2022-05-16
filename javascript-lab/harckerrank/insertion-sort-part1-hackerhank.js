var arr = [2,4,6,8,3]
/* var arr = 1 3 5 9 13 22 27 35 46 51 55 83 87 87 */
/* var arr = [2, 3, 4, 5, 6, 7, 8, 9, 10, 1] */
var n = arr.length
console.log(n)
var lastValue = arr[n-1]
console.log(lastValue);
for (var i = n-1; i >= 0; i--) {
    if (arr[i-1] > lastValue) {
        arr[i] = arr[i-1]
        var str = arr.join(' ')
        console.log(str)
    } else {
        arr[i] = lastValue
        if (i === 0) {
            arr[i] = lastValue
            var str = arr.join(' ')
            console.log(str)
            break;
        }
        var str = arr.join(' ')
        console.log(str)
        break;
    } 
}

/* for (var i = n-2; i >= 0; i--) {
    if (arr[i] > lastValue) {
        arr[i+1] = arr[i]
        var str = arr.join(' ')
        console.log(str)
    } else {
        arr[i+1] = lastValue
        var str = arr.join(' ')
        console.log(str)
    }
}
 */