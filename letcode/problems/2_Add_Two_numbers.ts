
const returnArray = (l1: Array<number>, l2: Array<number>) => {
  let result: Array<number> = []
  let acumulador = 0
  let validator = 0
  
  for (let i = 0; i <= l1.length - 1; i++) {
    if (l2[i] === undefined) {
      l2[i] = 0
    }
    if ((l1[i] + l2[i] + acumulador) >= 10) {
      validator = l1[i] + l2[i] + acumulador - 10
      if (validator === 0) {
        result.push(0)
        acumulador = 1
      } else {
        result.push(validator)
        acumulador = 1
      }
    }
    else {
      result.push(l1[i] + l2[i])
    }
  }
  console.log(acumulador)
  if (acumulador >= 1) {
    result.push(acumulador)
  }
  return result
}

const addTwoNumbers = (l1: Array<number>, l2: Array<number>) => {
  let result: Array<number> = []

  if (l1.length >= l2.length) {
    result = returnArray(l1, l2)
  } else {
    result = returnArray(l2, l1)
  }
  console.log(result)
  return result
}
addTwoNumbers([9,9,9,9,9,9,9], [9, 9, 9, 9])
// Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
// Output: [8,9,9,9,0,0,0,1]