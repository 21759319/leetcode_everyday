package com.zju.cst.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName TwoSum
 * @Description TODO
 * @Author xiaojian
 * @Date 2018/11/19 18:07
 * @Version 1.0
 */
public class TwoSum {

  public int[] twoSum(int[] nums, int target) {
    Map<Integer,Integer> map = new HashMap <>();
    for (int i = 0; i < nums.length; i++) {
      if (map.containsKey(target-nums[i])){
        return new int[] {map.get(target-nums[i]),i};
      }
      else{
        map.put(nums[i],i);
      }
    }
    return new int[]{0,0};
  }

}
