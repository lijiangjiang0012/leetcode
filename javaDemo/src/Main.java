import com.leetcode.*;

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
    }
}
