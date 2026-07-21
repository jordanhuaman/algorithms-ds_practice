class Solution3 {
  /**
   * @param {number[]} nums
   * @param {number} target
   * @return {number[]}
   */
  twoSum(nums: number[], target: number): number[] {
    let response: number[] = []
    let map = new Map<number, number>();

    for (let i = 0; i < nums.length; i++) {
      let rest = target - nums[i];
      if (map.has(rest)) {
        response.push(map.get(rest) as number);
        response.push(i);
        break;
      }
      map.set(nums[i], i);
    }
    return response;
  }
}

const instance3 = new Solution3();
const response3 = instance3.twoSum([1, 1], 2);
console.log(response3);