class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        
        // List<Integer>ans = new ArrayList<>();
        // for(int i = low; i <= high; i++){
        //     String val = String.valueOf(i);
        //     boolean seqDigit = true;
        //     for (int j = 0; j < val.length() - 1; j++) {
        //         int current = val.charAt(j) - '0';
        //         int next = val.charAt(j + 1) - '0';

        //         if (current + 1 != next) {
        //             seqDigit = false;
        //             break;
        //         }
        //     }
        //     if(seqDigit){
        //         ans.add(i);
        //     }
        // }
        // return ans;

        List<Integer> ans = new ArrayList<>();

        for (int start = 1; start <= 9; start++) {

            int num = start;

            for (int next = start + 1; next <= 9; next++) {

                num = num * 10 + next;

                if (num >= low && num <= high) {
                    ans.add(num);
                }
            }
        }

        Collections.sort(ans);
        return ans;
    }
}