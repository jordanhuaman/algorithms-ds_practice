const pow = (n: number, p:number): number=>{
  
  if(p==1){
    return n;
  }

  return n * pow(n, p-1);
}

const result = pow(5,3);
console.log(result);