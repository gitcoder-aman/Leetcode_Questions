class Solution {
    public int maximumLength(int[] nums) {

        HashMap<Long, Integer> freq = new HashMap<>();

        for (int num : nums) {
            freq.put((long) num, freq.getOrDefault((long) num, 0) + 1);
        }

        int ans = 1;

        for (long start : freq.keySet()) {

            // Special case for 1
            if (start == 1) {
                int count = freq.get(1L);

                if (count % 2 == 0)
                    ans = Math.max(ans, count - 1);
                else
                    ans = Math.max(ans, count);

                continue;
            }

            long curr = start;
            int len = 0;

            while (freq.getOrDefault(curr, 0) >= 2) {
                len += 2;
                curr = curr * curr;
            }

            if (freq.getOrDefault(curr, 0) >= 1)
                len++;
            else
                len--;

            ans = Math.max(ans, len);
        }

        return ans;
    }
}