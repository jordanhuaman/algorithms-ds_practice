import math;

arr = [1,2,3]

def search(n: list[int], target: int, low: int, higer:int):
  if(low>higer):
    return -1;
  
  middle = math.ceil((low+higer)/2);
  
  if(n[middle]==target):
    return middle;
  
  if(n[middle]>target):
    return search(n, target,low, middle-1);
  else:
    return search(n,target, middle+1, higer);

result = search(arr, 20, 0, len(arr)-1);
print(result);