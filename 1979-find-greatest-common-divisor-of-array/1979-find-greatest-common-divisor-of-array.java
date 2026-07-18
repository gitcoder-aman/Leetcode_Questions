class Solution {
    public int findGCD(int[] nums) {
        int g = Integer.MIN_VALUE;
        int s = Integer.MAX_VALUE;

        for(int i = 0; i < nums.length; i++){
            if(g < nums[i]){
                g = nums[i];
            }
            if(s > nums[i]){
                s = nums[i];
            }
        }
        int gcd = 1;
        for(int i = 2; i <= s; i++){
            if(g % i == 0 && s % i == 0){
                gcd = i;
            }
        }
        return gcd;
    }
}