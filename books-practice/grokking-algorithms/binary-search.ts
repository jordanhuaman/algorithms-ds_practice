function binary_search(list: Array<number>, element: number) {
  let low = 0;
  let high = list.length - 1;

  while (low <= high) {
    let mid = Math.floor((low + high) / 2);
    let guess = list[mid];
    if (guess === element) {
      return mid;
    }
    if (guess > element) {
      high = mid - 1;
    } else {
      low = mid + 1;
    }
  }
  return null;
}
function generarNumeros() {
  let numeros: Array<number> = [];
  for (let i = 0; i <= 20; i++) {
    numeros.push(i);
  }
  return numeros;
}

const list = generarNumeros()
console.log(list.length)
console.log(binary_search(list, 12))