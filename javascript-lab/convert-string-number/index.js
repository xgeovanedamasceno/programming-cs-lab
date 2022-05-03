/* Ways of convert a String to a Number */

// Number function
const stringNumber = "12";
console.log(typeof stringNumber);
console.log(stringNumber+1)

const numberValue = Number(stringNumber)
console.log(typeof numberValue)
console.log(numberValue+1)

console.log(Number("Hello World!"))

// parseInt() function
const numberParsed = parseInt(stringNumber, 10);
console.log(numberParsed);

const stringFloatNumber = "12.99";
let floatNumberParsed = parseInt(stringFloatNumber);
floatNumberParsed = parseFloat(stringFloatNumber)
console.log(floatNumberParsed)

console.log("A letter first...")
const stringNumberLetter = "F12.99";
let numberAndLetterParsed = parseInt(stringNumberLetter)
console.log(numberAndLetterParsed) // ?
console.log(numberAndLetterParsed+1)
console.log(typeof numberAndLetterParsed) // ?


// Unary Operator
console.log(+stringNumber)
console.log(+stringFloatNumber)
console.log(+"HelloWorld!");

// multiplying by the number 1
console.log(stringNumber * 1)
console.log(stringFloatNumber * 1)
console.log("Hello World" * 1)

// dividing by the number one
console.log(stringNumber / 1)
console.log(stringFloatNumber / 1)
console.log("Hello World"/1)

// subtracting by the number 0
console.log(stringNumber - 0)
console.log(stringFloatNumber - 0)
console.log("Hello World" - 0)

// by the bitwise NOT operator
console.log(~stringNumber)
console.log(~~stringNumber)
console.log(~~stringFloatNumber)
console.log(~~"Hello World!")

// By using Math.floor()
const numberByMathFloor = Math.floor(stringFloatNumber);
console.log(numberByMathFloor)
console.log(Math.floor("Hello World!"))

// By using Math.ceil()
const numberByMathCeil = Math.ceil(stringFloatNumber)
console.log(numberByMathCeil)

// By using Math.round()
console.log(Math.round("6.3"))
console.log(Math.round("6.5"))
