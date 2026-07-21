/**
 * Time complexity: O(n^2)
 * Space complexity: O(n)
 * @param arr 
 * @param n 
 * @returns 
 */
const uniqueness = (arr: number[], n: number): boolean => {
  //? Base case
  if (n == 1) {
    return true;
  }

  //? Recurion case
  if (!uniqueness(arr, n - 1)) {
    return false;
  }

  for (let i = 0; i < n - 1; i++) {
    if (arr[i] == arr[n - 1]) {
      return false;
    }
  }

  return true;
}

const result = uniqueness([1, 2, 3, 4, 10, 100], 7);
console.log(result);

/**
 * Time complexity: O(n)
 * Space complexity: O(n)
 * @param m 
 * @param n 
 * @returns 
 */
const productWithoutPower = (m: number, n: number): number => {
  if (n == 1) {
    return m;
  }
  return m + productWithoutPower(m, n - 1);
}

const pwp = productWithoutPower(3, 10);
console.log(pwp)

const subArrays = [];
// const subArraysNoRepeat = (arr: number[], n: number): any[] => {
  // if (n == 0) {
  //   subArrays.push([arr[n]])
  // }

  // if (n > 1) {
  //   subArrays(arr, n - 1);
  // }

  // return subArrays;
// }