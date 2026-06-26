class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        
        int n = nums.length;
        int[] prefixSum = new int[n];
        int count = 0;
        
        prefixSum[0] = nums[0];
        for(int i = 1; i < n; i++){
            prefixSum[i] = prefixSum[i-1]+nums[i];
        }
        HashMap<Integer,Integer>map = new HashMap<>();

        for(int j = 0; j < n; j++){
            if(prefixSum[j] == goal) count++;
            
            if(map.containsKey(prefixSum[j] - goal)){
                count += map.get(prefixSum[j]-goal);
            }
            map.put(prefixSum[j],map.getOrDefault(prefixSum[j],0)+1);
        }
        return count;
    }
}