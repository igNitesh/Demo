package core_java.array.leetcode;

public class LC1929 {
    public int[] getConcatenation(int[] nums) {

        int ans[] = new int[(nums.length*2)];

        for(int i = 0; i < nums.length ; i++){
            ans[i] = nums[i];
        }

        for(int i=nums.length, x =0; i < ans.length ; i++){
            ans[i] = nums[x];
            x++;
        }

        return ans;
        
    }
}
