package com.leetcode;

/**
 * @author lijiangjiang0012
 * 合并两个有序数组
 * <p>
 * 给定两个有序整数数组 nums1 和 nums2，将 nums2 合并到 nums1 中，使得 num1 成为一个有序数组。
 * <p>
 * 说明:
 * <p>
 * 初始化 nums1 和 nums2 的元素数量分别为 m 和 n。
 * 你可以假设 nums1 有足够的空间（空间大小大于或等于 m + n）来保存 nums2 中的元素。
 * 示例:
 * <p>
 * 输入:
 * nums1 = [1,2,3,0,0,0], m = 3
 * nums2 = [2,5,6],       n = 3
 * <p>
 * 输出: [1,2,2,3,5,6]
 * <p>
 * https://blog.csdn.net/u011750466/article/details/80075081
 */

public class Solution88 {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int k = m + n;
        while (m > 0 && n > 0) {
            if (nums1[m - 1] >= nums2[n - 1]) {
                nums1[k - 1] = nums1[m - 1];
                --k;
                --m;
            } else {
                nums1[k - 1] = nums2[n - 1];
                --k;
                --n;
            }
        }
        while (n > 0) {
            nums1[k - 1] = nums2[n - 1];
            --k;
            --n;
        }
    }

}
