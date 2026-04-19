package core_java.array.leetcode;

/**
 * LeetCode 1920: Build an Array From a Permutation
 * 
 * Given a zero-indexed permutation nums of length n, build an array ans of the same length
 * where ans[i] = nums[nums[i]] for each 0 <= i < n.
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(n) for the result array
 */
public class LC1920 {
    
    public int[] buildArray(int[] nums) {
        int ans[] = new int[nums.length];
        
        // Build answer array using index mapping
        for(int i = 0; i < nums.length; i++){
            ans[i] = nums[nums[i]];
        }

        return ans;
    }
}
