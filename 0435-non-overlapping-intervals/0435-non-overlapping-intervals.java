class Solution {

    public int eraseOverlapIntervals(int[][] intervals) {
        int result = 0;
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        List<int[]> list = new ArrayList<>();
        int prevEnd = intervals[0][1];
        for (int i = 1; i < intervals.length; i++) {
            int end = intervals[i][1];
            int start = intervals[i][0];
            if (start >= prevEnd) {
                prevEnd = end;
            } else {
                result++;
                prevEnd = Math.min(end, prevEnd);
            }
        }
        return result;
    }
}
