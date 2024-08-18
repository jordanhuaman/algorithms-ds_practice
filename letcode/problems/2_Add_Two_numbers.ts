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

const returnArray = (l1: Array<number>, l2: Array<number>) => {
  let result: Array<number> = []
  let acumulador = 0;
  let validator = 0;
  for (let i = 0; i <= l1.length - 1; i++) {
    if (l2[i] === undefined) {
      l2[i] = 0
    }
    validator = (l1[i] + l2[i] + acumulador)
    console.log(validator)
    acumulador = 0
    if (validator >= 10) {
      acumulador = l1[i] + l2[i] - 9
      console.log(acumulador)
      result.push(validator % 10)

    } else {
      result.push(validator)
    }
  }
  console.log(acumulador)
  return result
}

addTwoNumbers([1, 1, 1], [9, 9, 9, 9])