for (i = 1; i < 5; i++) {
  mult = 2;
  console.log(`value of i ${i}`)
  for (j = i; mult <= i; mult++) {

    result = j * mult;
    if (result != j) 
      console.log(`result ${result}`);
    

  }
  console.log("---")
}