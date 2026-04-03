import math;

def f(n:int) -> int:
  rest = n%10;
  forward = math.trunc( n/10);
  
  if(forward==0):
    return rest;
  
  return rest + f(forward);

print(f(2000001));