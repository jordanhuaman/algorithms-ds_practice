function qsort(arr: number[]): number[] {
  if (arr.length <= 1) {
    console.log('hello')
    return arr;
  }
  console.log('another')
  const pivot = arr[0]
  const lef = arr.filter((x) => x < pivot)
  const right = arr.filter((x) => x > pivot)
  // console.log({lef, pivot, right})
  return [...qsort(lef), pivot, ...qsort(right)]
}

console.log(qsort([10, 2, 12, 1, 29, 30]))