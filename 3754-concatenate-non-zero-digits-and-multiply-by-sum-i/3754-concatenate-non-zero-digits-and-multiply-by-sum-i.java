class Solution {
    public long sumAndMultiply(int n) {
        
        StringBuilder digits = new StringBuilder();

        while(n != 0){
            int rem = n % 10;
            if(rem != 0){
                digits.append(rem);
            }
            n /= 10;
        }
        //4321
        long num = 0;
        int k = 0;
        long sum = 0;
        for(int i = digits.length()-1; i >= 0; i--){
            char ch = digits.charAt(i);
            int digit = ch - '0';
            num = (num*(int)Math.pow(10,1)) + digit;
            sum += digit;
        }
        return num * sum;
    }
}