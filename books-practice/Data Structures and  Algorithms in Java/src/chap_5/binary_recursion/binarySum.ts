/**
 * @info When a method makes two recursive calls, we say that it uses **binary recursion**.
 * @info Space complexity O(1+log₂n), Time complexity O(n).
 * @info LinearSum is O(n) in space complexity.
 * @param arr - The array of numbers to sum.
 * @param low - The starting index of the array segment to sum.
 * @param high - The ending index of the array segment to sum.
 * @returns The sum of the elements in the specified segment of the array.
 */
const binarySum = (arr: number[], low: number, high: number): number => {
  if (low > high) {
    return 0;
  }
  else if (low == high) {
    return arr[low];
  }
  else {
    let mid = Math.floor((low + high) / 2);
    return binarySum(arr, low, mid) + binarySum(arr, mid + 1, high);
  }
}

const arr = [1, 2, 3, 4, 5,10];
console.log(binarySum(arr, 0, arr.length - 1));
