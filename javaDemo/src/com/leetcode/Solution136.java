package com.leetcode;
import java.util.HashSet;
import java.util.Set;

public class Solution136 {

    public int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)) {
                set.remove(num);
            }
        }
        if (set.isEmpty()) {
            return 0;
        }
        return set.iterator().next();
    }
}

