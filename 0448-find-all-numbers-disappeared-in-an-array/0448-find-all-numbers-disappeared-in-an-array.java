class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        // HashSet<Integer>set = new HashSet<>();

        // for(int n : nums){
        //     set.add(n);
        // }
        // List<Integer>ans = new ArrayList<>();
        // for(int i = 1; i <= nums.length; i++){
        //     if(!set.contains(i)){
        //         ans.add(i);
        //     }
        // }
        // return ans;

        List<Integer>ans = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            int index = Math.abs(nums[i]) - 1;

            if(nums[index] > 0){
                nums[index] = -nums[index];
            }
        }

        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0){
                ans.add(i+1);
            }
        }
        return ans;
    }
}