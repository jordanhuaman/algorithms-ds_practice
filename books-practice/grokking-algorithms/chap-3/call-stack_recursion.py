def fact(x):
  print(x)
  if x == 1:
    return 1
  else:
    return x * fact(x-1) # 4*3*2*1
print(fact(4))
def sumaAdded(x):
  print(x)
  if x == 0:
    return 0
  else:
    return x + sumaAdded(x-1)
print(sumaAdded(4))