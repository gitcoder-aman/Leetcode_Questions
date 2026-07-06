class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        
        Arrays.sort(intervals, (a, b) -> {
            if (a[0] == b[0])
                return b[1] - a[1];   // larger end first
            return a[0] - b[0];
        });

        // for (int i = 0; i < intervals.length; i++) {
        //    System.out.println(Arrays.toString(intervals[i]));
        // }
        int count = 0;
        int maxEnd = 0;
        for(int[] interval : intervals){
            if(interval[1] > maxEnd){
                maxEnd = interval[1];
                count++;
            }
        }
        return count;
    }
}