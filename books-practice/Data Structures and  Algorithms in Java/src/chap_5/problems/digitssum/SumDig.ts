const f = (n: number): number => {

  const rest = n%10;
  const forward =Math.floor(n/10);

  if(forward==0){
    return rest;
  }
  return rest + f(forward);
}

console.log(f(1003))