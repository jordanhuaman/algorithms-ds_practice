def binary_search(list, item):
  low=0  #0
  high=len(list)-1 #4 -> 0,1,2,3,4
  
  while low <= high: # 0 <=4
    print('run')
    mid=(low+high) // 2 # 2
    guess=list[mid] # mid position -> 5
    if guess == item: # 9 == 4 X
      return mid 
    if guess > item: # 9 > 7
      high=mid-1 # 3
    else:
      low=mid+1
  return None

mi_List = [1,3,5,7,9]
print(binary_search(mi_List, 7))
print(binary_search(mi_List,-1))