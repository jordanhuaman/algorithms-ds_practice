function findSmaller(arr: Array<number>) {
  let smallest = arr[0]
  let smallest_index = 0
  for (let i = 1; i <= arr.length; i++) {
    if (arr[i] < smallest) {
      smallest = arr[i]
      smallest_index = i
    }
  }
  return smallest_index
}

function selecctionSort(arr: Array<number>) {
  const sortedArray: Array<number> = []
  let length = arr.length;
  console.log(length)
  for (let i = 0; i < length; i++) {
    let indexValue = findSmaller(arr)
    sortedArray.push(arr[indexValue])
    //? Another watnewArr.push(...arr.splice(smallestIndex, 1));
    arr = arr.filter((d)=> d !== arr[indexValue])
  }
  return sortedArray
}

console.log(selecctionSort([5, 3, 6, 2, 10, 1]))