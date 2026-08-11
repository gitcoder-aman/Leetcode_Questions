class Solution {
    public int missingInteger(int[] nums) {

        int idx = 0;
        int sum = nums[0];

        for(int i = 1; i < nums.length; i++){
            if(nums[i] - nums[i-1] != 1){
                idx = i - 1;
                break;
            }else{
                sum += nums[i];
            }
        }
        for(int i = idx; i < nums.length; i++){
            if(nums[i] == sum){
                sum = sum + 1;
                i = idx;
            }
        }
        return sum;
    }
}