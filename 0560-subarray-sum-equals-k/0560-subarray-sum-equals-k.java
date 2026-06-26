class Solution {
    public int subarraySum(int[] nums, int k) {
        
        int[] prefixSum = new int[nums.length];
        int count = 0;
        HashMap<Integer,Integer>map = new HashMap<>();

        prefixSum[0] = nums[0];
        for(int i = 1; i < nums.length; i++){
            prefixSum[i] = nums[i] + prefixSum[i-1];
        }
        for(int j = 0; j < nums.length; j++){
            if(prefixSum[j] == k) count++;

            int val = prefixSum[j] - k;
            if(map.containsKey(val)){
                count += map.get(val);
            }
           
            map.put(prefixSum[j],map.getOrDefault(prefixSum[j],0)+1);
        }
        return count;
    }
}