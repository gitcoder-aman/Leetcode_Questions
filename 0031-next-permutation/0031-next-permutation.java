class Solution {
    private void reverse(int[] nums,int i,int j){
        while(i <= j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
    public void nextPermutation(int[] nums) {

        int len = nums.length;
        int idx = -1;

        //find pivot
        for(int i = len-1; i > 0; i--){
            if(nums[i-1] < nums[i]){
                idx = i-1;
                break;
            }
        }
        // No pivot -> already largest permutation
        if(idx == -1){
            reverse(nums,0,len-1);
            return;
        }
         // Reverse suffix
        reverse(nums, idx + 1, len - 1);

        for(int i = idx + 1; i < len; i++){
            if(nums[i] > nums[idx]){
                int temp = nums[i];
                nums[i] = nums[idx];
                nums[idx] = temp;
                break;
            }
        }
    }
}