const fn = (s: string): string => {

  const size = s.length;

  if(size ==1){
    return s;
  }

  return s.slice(size-1,size) + fn(s.slice(0,size-1));
}

const result = fn("Holla1");
console.log(result);