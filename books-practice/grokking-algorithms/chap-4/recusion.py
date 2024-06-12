def sum(list):
  if list == []:
    return 0
  return list[0] + sum(list[1:])
sum([1,2,3,4,5])

def count(list):
  if list == []:
    return 0
  return 1 + count(list[1:])
print(count([1,2,3,4,5,6,6,7,7,1]))

def max(list):
  if len(list) == 2:
    print('Ejecutandose1')
    return list[0] if list[0] > list[1] else list[1]
  print('ejecutandose2')
  sub_max = max(list[1:])
  print('Ejecucion3')
  return list[0] if list[0] > sub_max else sub_max
print(max([1,2,3,4,5,10,12,2,20]))

def smallest(list):
  if len(list)==2:
    return list[0] if list[0]<list[1] else list[1]
  sub_min=smallest(list[1:])
  return list[0] if list[0]<sub_min else sub_min
print(smallest([20,20,30,20,1,100,0]))