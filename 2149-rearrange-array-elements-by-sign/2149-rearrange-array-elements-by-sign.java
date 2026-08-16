class Solution {
    public int[] rearrangeArray(int[] nums) {
        
        int len = nums.length;
        int[] ans = new int[len];

        int i = -1;
        int j = -1;

        for(int k = 0; k < len; k++){
            if(nums[k] > 0 && i == -1){
                i = k;
            }
            if(nums[k] < 0 && j == -1){
                j = k;
            }
            if(i != -1 && j != -1) break;
        }
        int k = 0;
        while(i < len && j < len){
            if(nums[i] > 0){
                ans[k++] = nums[i++];
                while(i < len && nums[i] < 0){
                    i++;
                }
            }
            if(nums[j] < 0){
                ans[k++] = nums[j++];
                while(j < len && nums[j] > 0){
                    j++;
                }
            }
        }
        return ans;
    }
}