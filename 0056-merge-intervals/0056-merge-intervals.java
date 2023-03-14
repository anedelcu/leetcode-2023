class Solution {
    public int[][] merge(int[][] intervals) {
        // Sort the intervals by their start time
        Arrays.sort(intervals, (a, b) -> a[0] -  b[0]);
        
        // Create a list to store the merged intervals
        List<int[]> mergedIntervals = new ArrayList<>();
        
        // Iterate through the intervals and merge overlapping one
        int i = 0;
        while(i < intervals.length) {
            int start = intervals[i][0];
            int end = intervals[i][1];
            
            // FInd the end of the merged interval
            while(i < intervals.length - 1 && intervals[i + 1][0] <= end) {
                i++;
                end = Math.max(end, intervals[i][1]);
            }
            
            // Add merged interval to the list
            mergedIntervals.add(new int[]{start, end});
            i++;
        }
        
        // Convert the list of merget intervlas to an array
        int[][] result = new int[mergedIntervals.size()][2];
        for(i = 0; i < result.length; i++) {
            result[i] = mergedIntervals.get(i);
        }
        return result;
    }
}