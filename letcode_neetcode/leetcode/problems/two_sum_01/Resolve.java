package letcode.problems.two_sum_01;

import java.util.HashMap;
import java.util.Map;

public class Resolve {
  public static void main(String[] args) {
    Resolve resolve = new Resolve();

    int[] nums = { 2, 7, 11, 15 };
    int target = 9;

    System.out.println(resolve.twoSum(nums, target));
  }

  /**
   * ? Time Complexity -> BigO(n²)
   */
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

  public int[] twoSum2(int[] nums, int target) {
    Map<Integer, Integer> complements = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      Integer complementIndex = complements.get(nums[i]);
      if (complementIndex != null) {
        return new int[] { i, complementIndex };
      }
      complements.put(target - nums[i], i);
    }
    return nums;
  }

  public int[] twoSum3(int[] nums, int target) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      int current = nums[i];
      // ? current + x = target
      // ? x = target - current
      int x = target - current;
      if (map.containsKey(x)) {
        return new int[] { map.get(x), i };
      }
      //{key, value} -> [{1,0},{2,1},{3,2}]
      map.put(current, i);
    }
    return nums;
  }
}

/**
 * Given [1,2,3,5] -> 7
 * Result [2,5] -> [1,3] || [3,1]
 */