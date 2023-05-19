class Solution {

    public String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer, String> map = new HashMap<>();

        int n = heights.length;
        String[] temp = new String[n];

        for (int i = 0; i < n; i++) {
            map.put(heights[i], names[i]);
        }

        Arrays.sort(heights);
        int k = 0;

        for (int i = n - 1; i >= 0; i--, k++) {
            temp[k] = map.get(heights[i]);
        }
        return temp;
    }
}
