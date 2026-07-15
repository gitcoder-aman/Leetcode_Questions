class Solution {
    public static int gcd(int a ,int b){

        int n = a > b?b : a;
        int ans = 0;
        for(int i = 1; i <=n; i++){
            if(a%i == 0 && b % i == 0){
                ans = i;
            }
        }
        return ans;
    }
    public int gcdOfOddEvenSums(int n) {
        
        // int oddSum = 0;
        // int evenSum = 0;

        // for(int i = 1; i <= n*2; i++){
        //     if(i % 2 != 0){
        //         oddSum += i;
        //     }else{
        //         evenSum += i;
        //     }
        // }
        // return gcd(oddSum,evenSum);
        return n;
    }
}