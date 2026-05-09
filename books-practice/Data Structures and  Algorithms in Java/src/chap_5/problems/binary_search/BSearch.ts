// arr might be sorted
const search = (arr: number[], target: number, low: number, higher: number): number => {

  if (low > higher) {
    return -1
  }

  var middle: number = Math.round((low + higher) / 2);
  console.log(middle)

  if (arr[middle] == target) {
    return middle;
  }

  if (arr[middle] > target) {
    console.log(arr[middle])
    return search(arr, target, low, middle - 1);
  }
  else {
    return search(arr, target, middle + 1, higher);
  }
}

const result2 = search([1, 10, 20, 21, 30], 1, 0, 4);
console.log(result2);