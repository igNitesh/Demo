package core_java.array.leetcode;

/**
 * LeetCode 1929: Concatenation of Array
 * 
 * Given an integer array nums of length n, you want to create an array ans
 * of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n.
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(n) for the result array
 */
public class LC1929 {
    
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n * 2];

        // Copy original array to first half
        for(int i = 0; i < n; i++){
            ans[i] = nums[i];
        }

        // Copy original array to second half
        for(int i = 0; i < n; i++){
            ans[n + i] = nums[i];
        }

        return ans;
    }
}
