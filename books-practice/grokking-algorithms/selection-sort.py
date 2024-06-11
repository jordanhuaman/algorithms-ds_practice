def findSmallest(arr):
  smaless = arr[0] # First element
  smaless_index = 0 # index=0
  for i in range(1, len(arr)): # 1-2-3-4-n
    # Tiene que comenzar a compara uno por emcina o sea n+1 < n
    if arr[i] < smaless: # 1 - 0
      smaless = arr[i]
      smaless_index = i
  return smaless_index

def selectionSort(arr):
  newArr = []
  for i in range(len(arr)):
    smallest = findSmallest(arr)
    newArr.append(arr.pop(smallest))
  return newArr

print(selectionSort([5,3,6,2,10]))