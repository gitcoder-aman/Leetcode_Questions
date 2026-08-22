class Solution {
    public int subarraySum(int[] nums, int k) {
        
        HashMap<Integer,Integer>map = new HashMap<>();
        int[] prefixSum = new int[nums.length];

        prefixSum[0] = nums[0];
        for(int i = 1 ; i < nums.length; i++){
            prefixSum[i] = prefixSum[i-1] + nums[i];
        }
        int count = 0;
        for(int i = 0; i < nums.length; i++){

            if(prefixSum[i] == k) count++; 
            int val = prefixSum[i] - k;
            if(map.containsKey(val)){
                count += map.get(val);
            }

            map.put(prefixSum[i],map.getOrDefault(prefixSum[i],0)+1);
        }
        return count;
    }
}