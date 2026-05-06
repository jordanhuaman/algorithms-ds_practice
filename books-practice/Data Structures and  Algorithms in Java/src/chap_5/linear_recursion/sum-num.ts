//? [10,11,20] , 3
const sum = (data: number[], n: number): number => {
  if (n == 0) {
    return 0;
  }
  else {
    return sum(data, n - 1) + data[n - 1];
  }
}

//? Time complexity: O(n)
//? Memory space: O(n)