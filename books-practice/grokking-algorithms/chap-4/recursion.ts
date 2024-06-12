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
console.log(max([11, 10, 1, 14, 3, 0, 12]))

function factorial(obje: number) {
  if (obje === 1) {
    return 1
  }
  return obje * factorial(obje - 1)
}
console.log(factorial(5))

function findDuplicate(obje: number, arr: Array<number>) {
  if (arr.length === 1) {
    return (obje === arr[0]) ? true : false
  }
  let fakeDuplicate = findDuplicate(obje, arr.slice(1,))
  console.log({ d: fakeDuplicate, data1: arr[0], data2: arr[1], dat3:arr[2], len: arr.length })
  return (arr[0] === obje) ? true : false
}

function findDuplicate2(arr:Array<number>, index = 0) {
  if (index >= arr.length) {
    return false;
  }

  if (arr.indexOf(arr[index], index + 1) !== -1) {
    return true;
  }

  return findDuplicate2(arr, index + 1);
}
console.log(findDuplicate2([1,2,3,4,5,6,10,10,12,3]))
console.log(findDuplicate(2, [3, 4, 5, 2, 12, 20, 1, 2]))