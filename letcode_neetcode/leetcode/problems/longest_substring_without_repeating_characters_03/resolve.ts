/**
 * 
 * @param s "abcabc" 
 * @returns 3 -> abc
 */
const resolver = (s: string): number => {
  let size = 0;
  let current;
  for (let index = 0; index < s.length; index++) {
    current = s.substring(index === 0 ? 0 : index, index === 0 ? 1 : index + 1)
    console.log(current)
  }
  return size;
}

console.log(resolver("abc"))
console.log("abc".substring(1, 2))