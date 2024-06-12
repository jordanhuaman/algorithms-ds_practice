# TODO -> Find a key inside a lot of boxes
#? First approach
def look_for_key(main_box):
  pile = main_box.make_a_pile_to_look_through()
  while pile:
    box = pile.grab_a_box()
    for item in box:
      if item.is_a_box():
        pile.append(item)
      elif item.is_a_key():
        print('found the key')


#? Second approach
def look_for_key2(box):
  for item in box:
    if item.is_a_box(): #? Base case
      look_for_key2(item) #? Recursive case
    elif item.is_a_key(item):
      print('Found the key')