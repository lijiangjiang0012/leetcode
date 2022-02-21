import com.leetcode.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author lijiangjiang0012
 */
public class Main {

    public static void main(String[] args) {
        int[] s136 = {4, 1, 2, 1, 2};
        Solution136 solution136 = new Solution136();
        System.out.println(solution136.singleNumber(s136));

        int[] s169 = {3, 2, 3};
        Solution169 solution169 = new Solution169();
        System.out.println(solution169.majorityElement(s169));

        int[][] s240 = {{1, 4, 7, 11, 15}, {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22}, {10, 13, 14, 17, 24}, {18, 21, 23, 26, 30}};
        Solution240 solution240 = new Solution240();
        System.out.println(solution240.searchMatrix(s240, 5));

        int[] s88Num1 = {1, 2, 3, 0, 0, 0};
        int[] s88Num2 = {2, 5, 6};
        Solution88 solution88 = new Solution88();
        solution88.merge(s88Num1, 3, s88Num2, 3);
        System.out.println(Arrays.toString(s88Num1));

        String s125 = "A man, a plan, a canal: Panama";
        Solution125 solution125 = new Solution125();
        System.out.println(solution125.isPalindrome(s125));



        Solution5 solution5 = new Solution5();
        String ss = "abcddcba";

        System.out.println(solution5.isPalindromic(ss));


    }
}
