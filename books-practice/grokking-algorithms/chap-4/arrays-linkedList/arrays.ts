//? Declaración de array
let numbers: number[] = [1, 2, 3, 4];

//? Accediendo a elementos O(1)
console.log(numbers[0]); // Output: 1

/**
 * @Insertion
 * ? Push add a value in the last -> O(1)
 * ? If we add in another position it takes -> O(n)
 */
numbers.push(5);

/**
 * @Deletion
 * ? Push add a value in the last -> O(1)
 * ? If we add in another position it takes -> O(n)
 */
numbers.pop(); // Elimina el último elemento
numbers.shift(); // Elimina el primer elemento
numbers.unshift(0); // Agrega un elemento al principio