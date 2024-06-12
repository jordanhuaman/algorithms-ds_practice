function sum(arr: Array<number>) {
  if (arr.length === 0) {
    return 0
  }
  console.log(arr.slice(1))
  return arr[0] + sum(arr.slice(1))
}
console.log(sum([1, 2, 3, 4]))
function count(arr: Array<number>) {
  if (arr.length === 0) {
    return 0
  }
  return 1 + count(arr.slice(1))
}
console.log(count([1, 2, 3, 4, 0, 2, 10, 9]))

function max(arr: Array<number>) {
  if (arr.length === 2) {
    return (arr[0] > arr[1]) ? arr[0] : arr[1]
  }
  console.log(arr.length)
  let newMAx = max(arr.slice(1))
  console.log(arr.length)
  return (arr[0] > newMAx) ? arr[0] : newMAx
}
console.log(max([11, 10, 1, 14, 3, 0,12]))