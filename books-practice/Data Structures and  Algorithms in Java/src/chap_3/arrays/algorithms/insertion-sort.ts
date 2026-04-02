const unorderedArray = [5, 2, 4, 6, 1, 3]

function insertionSort<T extends number | string>(arr: T[]): T[] {
  for (let i = 1; i < arr.length; i++) {
    var curr = arr[i];
    let j = i - 1;

    while (j >= 0 && arr[j] > curr) {
      arr[j + 1] = arr[j];
      j--;
    }
    arr[j + 1] = curr;
  }

  return arr;
}
// Example usage:
console.log(insertionSort([5, 2, 4, 6, 1, 3]));
console.log(insertionSort(['d', 'a', 'c', 'b', 'e']));

