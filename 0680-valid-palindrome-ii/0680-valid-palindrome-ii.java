class Solution {

    public static boolean isPalindrome(String s, int left, int right){

        while(left < right){
            char ch1 = s.charAt(left);
            char ch2 = s.charAt(right);

            if(ch1 != ch2){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public boolean validPalindrome(String s) {

        int left = 0;
        int right = s.length() - 1;

        while(left < right){
             char ch1 = s.charAt(left);
        char ch2 = s.charAt(right);
            if(ch1 == ch2){
                left++;
                right--;
            }else{
                return isPalindrome(s,left+1,right) || isPalindrome(s,left,right-1);
            }
        }
        return true;
    }
}