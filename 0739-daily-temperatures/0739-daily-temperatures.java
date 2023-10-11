class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] res = new int[n];
        Stack<int[]> stack = new Stack<>();
        for(int i = 0; i < n; i++) {
            while(!stack.isEmpty() && temperatures[i] > stack.peek()[0]) {
                
                int resId = stack.peek()[1];
                stack.pop();
                res[resId] = i - resId;
            }
            stack.add(new int[]{temperatures[i], i});
        }
        return res;
    }
}