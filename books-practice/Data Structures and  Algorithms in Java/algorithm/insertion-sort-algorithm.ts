/**
 * @params
 */

const isa = (array: Array<number>) => {
  if (array.length === 1) return array;

  const output: Array<number> = []

  for (let i = 0; i < array.length; i++) {
    if (i === 0) {
      output.push(i)
    }
  }
  return output;
}
// 

console.log(isa([5, 1]))