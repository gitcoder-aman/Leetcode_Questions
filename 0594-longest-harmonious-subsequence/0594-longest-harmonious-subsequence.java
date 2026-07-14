class Solution {
    public int findLHS(int[] nums) {
        
        Arrays.sort(nums);

        int i = 0;
        int maxLen = 0;

        for(int j = 0; j < nums.length; j++){

            while(nums[j] - nums[i] > 1){
                i++;
            }
            if(nums[j] - nums[i] == 1){
                int len = j - i + 1;

                if(maxLen < len){
                    maxLen = len;
                }
            }
        }
        return maxLen;
    }
}