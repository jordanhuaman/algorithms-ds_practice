// 860. Lemonade change
/**
 * @param {number[]} bills
 * @return {boolean}
 */
const lemonadeChange = (bills: Array<number>): boolean => {
  let wallet = {
    5: 0,
    10: 0,
    20: 0,
  }
  let validate = true
  for (let bill in bills) {
    if (bills[bill] === 5) {
      wallet[5]++;
    }
    else if (bills[bill] === 10) {
      if (wallet[5] >= 1) {
        wallet[5]--
        wallet[10]++
      }
      else {
        validate = false
      }
    }
    else {
      if (wallet[5] >= 1 && wallet[10] <= 0) {
        wallet[5] = wallet[5] - 3;
        console.log('hey', wallet[5])
        if (wallet[5] < 0) {
          validate = false
        }
      }
      else if (wallet[10] >= 1 && wallet[5] <= 0) {
        validate = false
      } else if (wallet[10] >= 1 && wallet[5] >= 1) {
        wallet[10]--;
        wallet[5]--;
      } else {
        validate = false;
      }
    }
  }
  return validate
};


// [5, 5, 20, 5, 5, 10, 5, 10, 5, 20]
const resultado: boolean = lemonadeChange([5, 5, 10, 20, 5, 5, 5, 5, 5, 5, 5, 5, 5, 10, 5, 5, 20, 5, 20, 5])
console.log(resultado)