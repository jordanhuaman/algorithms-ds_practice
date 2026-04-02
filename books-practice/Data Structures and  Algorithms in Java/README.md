### Learning
> Es mejor tener un package raiz para que sea facil impotar Classes como `import src.Counter.java`

> If we have another construstor that uses another one we can use `this(paramerter param1, paramerter parame2)` 

- [ ] Completar los demas ejercicios -> *nos quedamos en* ? R-1.3

#### 3.1 Using Arrays
> Agregar arrays no lo entendi, pero el eliminar uno si.

3.1.2 Sorting an Array
-  The Insertion-Sort Algorithm -> basic algorithm
3.1.3 java.util Methods for Arrays and Random Numbers
- Usar  `java.util.Random` para generar numeros ramdos desde una semilla(**seed**)
- Tick tack toe -> lack of implemetation

3.5.2 Equivalence Testing with Linked Lists
- Diferences between arrays.equals(arrays) to Arrays.deepEquals(array1, array2)
  - .equals() -> para arrays unidimensionales **el problema en las n-dimensiones es que cada uno es un objeto y no hace referencia al mismo objeto y por eso se usa deepEquals()**
  - deepEquals() -> no toma importancia a las clases de que estan dentro, solo ve si son iguales o no, recorrendo valor por valor como en muestra en simpleLL
- retulst of getClass() and object.getClass()

### Notions
- The work of the conditionals might be help in many cases if we want to undestand well, so:
  - `console.log(true || 1 > this.arr[-1].getScore())` : when this logic is executed, only the first sentences is evaluated, and the second is ignored, because the `||` works like this.