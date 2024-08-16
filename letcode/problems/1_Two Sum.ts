const twoSum = (nums: Array<number>, target: number) => {
  const result: any = []
  outerLoop:
  for (let i = 0; i <= nums.length - 1; i++) {
    for (let a = i + 1; a <= nums.length - 1; a++) {
      let value = nums[i] + nums[a]
      if (value === target) {
        result.push(i, a)
        break outerLoop;
      }
    }
    ;
  }
}

const twoSum2 = (nums: Array<number>, target: number) => {
  const findIndex = (i: number, a: number): Array<number> => {  
    if (i >= nums.length - 1) {
      return [];
    }

    if (a >= nums.length) {
      return twoSum2(nums.slice(i + 1), target); // Llamada recursiva, eliminando el primer elemento
    }

    if (nums[i] + nums[a] === target) {
      return [i, a];
    }

    return findIndex(i, a + 1); // Continuar buscando con el siguiente índice `a`
  };

  return findIndex(0, 1);
}

twoSum2([2, 5, 5, 11], 10)