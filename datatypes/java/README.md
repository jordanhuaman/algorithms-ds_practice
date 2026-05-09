### [Arrays](/datatypes/java/src/Arrays.java)
- ArrayList is a implementation of **List**
- And **list** is a implementation of **Collections**.
- So, When we declare a new ArrayList we can define with **list**
- ArraysLists vs LinkedList
  - Both has a `get(int index)` but the implementation is really diferent.
  - ArrayList works with arrays[] -> O(1).
  - LinkedList works with nodes -> O(n).

### Float vs Double
- Java assumes **by default** any decimal like a `double`.
- Float can't handle the full presicion of a double.
- Float 32 bits -> When we define a float' variable, it fill 4bytes or 32 bits of storing.
- Double 64 bits

### Aritmetic
- `5/3 -> 1`. By default return the 0
- `(double) 5/3 -> 1.6666667` -> return the decimal part also.
- `5%3 -> 2` -> return the rest part