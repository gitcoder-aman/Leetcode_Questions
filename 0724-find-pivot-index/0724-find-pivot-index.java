class Solution {
    public int pivotIndex(int[] nums) {
        
        int len = nums.length;
        int[] prefix = new int[len];
        int[] suffix = new int[len];

        int sum = 0;
        int ans = -1;
        for(int i = 0; i < len; i++){
            sum += nums[i];
            prefix[i] = sum; 
        }
        
        sum = 0;
        for(int j = len-1; j >= 0; j--){
            sum += nums[j];
            suffix[j] = sum; 

            if(prefix[j] == sum){
                ans  = j;
            }
        }
        return ans;
    }
}