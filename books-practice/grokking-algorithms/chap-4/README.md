## Quicksort
> divide y vencerás (D&C), una técnica recursiva muy conocida para resolver problemas.
### Divide y vencerás (D&C)
- QuickSort usa D&C por defecto 
![Caso Practico](areas.png)
- Dos pasos para resolver un problema con D&C
    1 . Descubra el caso base. Este debería ser el caso más sencillo posible.
      - Seria mejor si un lado fuera multiplo del otro
        ![areaCasoBase](areaCasoBase.png)
    2 . Divida o disminuya su problema hasta que se convierta en el caso base.
      - 1680*640 -> 640*2 + 400 -> 400*1+240 -> 240*1 + 160 -> 160*1 + 80 -> 80*160 -> **base case**
      ![BaseCase](BaseCase.png)
- Tener en cuenta que ninguna de las funciones se ejecutan si no se ejecuta el caso base:
  ![runBaseCase](image.png)
> Cuando escribes una función recursiva que involucra una matriz, el caso base suele ser una matriz vacía o una matriz con un elemento. Si estás atascado, inténtalo primero.
### Un adelanto de la programación funcional
- Simplemente porque los lenguajes funcionales se te haran mas faciles de aprender