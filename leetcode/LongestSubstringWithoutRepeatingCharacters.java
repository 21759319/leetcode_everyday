package com.zju.cst.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName LongestSubstringWithoutRepeatingCharacters
 * @Description TODO
 * @Author xiaojian
 * @Date 2018/11/19 18:44
 * @Version 1.0
 */
public class LongestSubstringWithoutRepeatingCharacters {
  public int lengthOfLongestSubstring(String s) {

  Map<Character,Integer> map = new HashMap<>();
  char[] input = s.toCharArray();
  int left=0,i =0;
  int result=0;
    for (;i<input.length;i++) {
      if (!map.containsKey(input[i])){
        map.put(input[i],i);
      }else {
        result = Math.max(i-left,result);
        left=Math.max(map.get(input[i])+1,left);
        map.put(input[i],i);
      }
    }
    result = Math.max(i-left,result);
    return  result;
  }


}
