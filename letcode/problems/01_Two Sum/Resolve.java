class Resolve {
  public static void main(String[] args) {
    Resolve resolve = new Resolve();

    int[] nums = {2, 7, 11, 15};
    int target = 9;

    System.out.println(resolve.twoSum(nums, target));
  }

  public int[] twoSum(int[] nums, int target) {
    for (int i = 0; i < nums.length; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        if (nums[i] + nums[j] == target) {
          return new int[] { i, j };
        }
      }
    }
    return nums;
  }
}

/**
 * Given [1,2,3,5] -> 7
 * Result [2,5] -> [1,3] || [3,1]
 */
