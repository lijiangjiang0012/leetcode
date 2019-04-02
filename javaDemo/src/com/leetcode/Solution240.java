package com.leetcode;

/**
 * @author lijiangjiang0012
 * 编写一个高效的算法来搜索 m x n 矩阵 matrix 中的一个目标值 target。该矩阵具有以下特性：
 * <p>
 * 每行的元素从左到右升序排列。
 * 每列的元素从上到下升序排列。
 * 示例:
 * <p>
 * 现有矩阵 matrix 如下：
 * <p>
 * [
 * [1,   4,  7, 11, 15],
 * [2,   5,  8, 12, 19],
 * [3,   6,  9, 16, 22],
 * [10, 13, 14, 17, 24],
 * [18, 21, 23, 26, 30]
 * ]
 * 给定 target = 5，返回 true。
 * <p>
 * 给定 target = 20，返回 false。
 * <p>
 * https://blog.csdn.net/xushiyu1996818/article/details/86217394
 */
public class Solution240 {

    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0) {
            return false;
        }
        if (matrix[0].length == 0) {
            return false;
        }

        //从左下角到右上角查找
        int currentRow = matrix.length - 1;
        int currentCol = 0;

        while (currentRow >= 0 && currentCol < matrix[0].length) {
            int currentNum = matrix[currentRow][currentCol];
            if (currentNum == target) {
                return true;
            } else if (currentNum < target) {
                currentCol++;
            } else {
                currentRow--;
            }
        }
        return false;


    }
}
