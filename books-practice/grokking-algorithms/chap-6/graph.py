from collections import deque
graph = {}

graph["you"] = ["alice", "bob", "calire"]
graph["bob"] = ["anuj", "peggy"]
graph["alice"] = ["peggy"]
graph["calire"] = ["thom", "jonny"]
graph["anuj"] =[]
graph["peggy"]=[]
graph["thom"]=[]
graph["jonny"]=[]


def search(name):
  search_queue = deque()
  search_queue += graph[name]
  searched = []
  while search_queue:
    person = search_queue.popleft()
    if person_is_saller(person):
      print(person + "is a mango seller")
      return True
    else:
      search_queue += graph[person]
      searched.append(person)
  return False
search("your")