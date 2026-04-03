def pow(n:int, p : int):
  
  if(p==1):
    return n;

  return n*pow(n,p-1);
print(pow(5,3))