class Solution {
  /**
   * @param {number[]} nums
   * @return {boolean}
   */
  hasDuplicate(nums: number[]): boolean {
    for (let i = 0; i < nums.length; i++) {
      for (let j = i + 1; j < nums.length; j++) {
        if (nums[i] === nums[j]) {
          return true;
        }
      }
    }

    return false;
  }
}

let test = [1, 2, 3,10,12,200,1000,1,];
let instance = new Solution();
let response = instance.hasDuplicate(test);
console.log(response)