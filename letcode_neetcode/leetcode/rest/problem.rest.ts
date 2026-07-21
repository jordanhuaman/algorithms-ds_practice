// 860. Lemonade change
/**
 * @param {number[]} bills
 * @return {boolean}
 */
const lemonadeChange2 = (bills: Array<number>): boolean => {
  let wallet = {
    5: 0,
    10: 0,
    20: 0,
  }
  let devolver = 0
  let resolver = true

  bills.forEach(element => {
    let rest = 0
    wallet[element]++
    rest = element - 5
    if (rest / 5 === 1) {
      wallet[5]--
    } else {
      if (Math.floor(rest / 10)) {
        wallet[10] = wallet[10] - Math.floor(rest / 10)
        if (wallet[10] < 0) {
          resolver = false
        } else {
          rest = rest - 10 * Math.floor(rest / 10)
        }
      }
      if (rest > 0) {
        wallet[5]--
      }
    }
  });
  console.log(wallet)

  for (let bill in wallet) {
    if (wallet[bill] < 0) {
      console.log('not ')
      resolver = false
    }
  }
  return resolver
};


const resultado2: boolean = lemonadeChange2([5, 5, 20, 5, 5, 10, 5, 10, 5, 20])
console.log(resultado)