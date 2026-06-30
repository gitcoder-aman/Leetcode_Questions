class Solution {
    public int numberOfSubstrings(String s) {
        
        int n = s.length();
        int[] freq = new int[3];
        int left = 0;
        int ans = 0;

        for(int r = 0; r < n; r++){
            char ch = s.charAt(r);
            freq[ch - 'a']++;

            while(freq[0] > 0 && freq[1] > 0 && freq[2] > 0){
                ans += (n - r);

                freq[s.charAt(left) - 'a']--;
                left++;
            }
        }
        return ans;
    }
}