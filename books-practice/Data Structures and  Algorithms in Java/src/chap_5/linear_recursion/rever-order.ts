const reversOrder = (data: number[], low: number, high: number) => {
  if (low < high) {
    var temp = data[low];
    data[low] = data[high];
    data[high] = temp;
    return reversOrder(data, low + 1, high - 1)
  }
  return data;
}

const result = reversOrder([1, 10, 12,20], 0, 3);
console.log(result)

// O(n/2  + c) : O(n)
// S(n)