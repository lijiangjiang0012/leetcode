package com.leetcode;

/**
 * @author lijiangjiang0012
 * 求众数
 * <p>
 * 给定一个大小为 n 的数组，找到其中的众数。众数是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素。
 * <p>
 * 你可以假设数组是非空的，并且给定的数组总是存在众数。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [3,2,3]
 * 输出: 3
 * 示例 2:
 * <p>
 * 输入: [2,2,1,1,1,2,2]
 * 输出: 2
 *
 * https://www.zhihu.com/question/49973163
 */
public class Solution169 {
    public int majorityElement(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int count = 0;
        int result = 0;
        for (int num : nums) {
            if (count == 0) {
                result = num;
                count = 1;
            } else if (result == num) {
                count++;

            } else {
                count--;
            }
        }
        return result;
    }

}
