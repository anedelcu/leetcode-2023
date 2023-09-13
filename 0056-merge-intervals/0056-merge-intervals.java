class Solution {

    public int[][] merge(int[][] intervals) {
        List<int[]> result = new ArrayList<>();

        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        result.add(intervals[0]);
        int index = 0;

        for (int i = 1; i < intervals.length; i++) {
            int end = result.get(index)[1];
            int start = intervals[i][0];
            if (start <= end) {
                int[] interval = result.remove(index);
                index--;
                //System.out.println("[" + interval[0] + ", " + interval[1] + "]");
                interval[1] = Math.max(interval[1],intervals[i][1]);
                result.add(interval);
                index++;
            } else {
                result.add(intervals[i]);
                index++;
            }
        }

        return result.toArray(new int[result.size()][]);
    }
}
