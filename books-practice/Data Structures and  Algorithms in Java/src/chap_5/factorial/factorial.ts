const factorial: (n: number) => number = (n: number): number => {
  if(n<2){
    return n;
  }
 
  return n * factorial(n-1);
}

const result = factorial(1);
console.log(result); 