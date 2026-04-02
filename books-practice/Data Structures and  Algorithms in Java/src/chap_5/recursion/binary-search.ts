const binarySearchFn = (data: number[], target: number, low: number, high: number): boolean => {

  if (!low > !high) {
    return false;
  }
  else {
    const mid = Math.floor((low + high) / 2);
    if (target == data[mid]) {
      console.log("base-case")
      return true;
    }
    else if (target < data[mid]) {
      return binarySearchFn(data, target, low, mid - 1);
    }
    else {
      return binarySearchFn(data, target, mid + 1, high);
    }
  }
}

const test = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12];
binarySearchFn(test, 2, 1, 12);