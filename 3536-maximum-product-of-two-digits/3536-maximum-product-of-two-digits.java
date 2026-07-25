class Solution {
    public int maxProduct(int n) {
        
        int maxi = Integer.MIN_VALUE;
        int secMaxi = maxi;

        while(n != 0){

            int rem = n % 10;
            if(maxi < rem){
                secMaxi = maxi;
                maxi = rem;
            }else if(secMaxi <= rem && maxi >= rem){
                secMaxi = rem;
            }
            n = n/10;
        }
        return maxi * secMaxi;
    }
}