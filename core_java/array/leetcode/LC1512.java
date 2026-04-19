package core_java.array.leetcode;

/**
 * LeetCode 1512: Number of Good Pairs
 * 
 * Given an array of integers nums, return the number of good pairs.
 * A pair (i, j) is called good if nums[i] == nums[j] and i < j.
 * 
 * Time Complexity: O(n^2)
 * Space Complexity: O(1)
 */
public class LC1512 {
    
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        
        // Compare each element with all subsequent elements
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                // If elements are equal, increment count
                if(nums[i] == nums[j]){
                    count++;
                }
            }
        }
        
        return count;
    }
}
