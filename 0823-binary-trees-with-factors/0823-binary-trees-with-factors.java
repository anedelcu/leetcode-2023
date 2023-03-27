class Solution {
    public int numFactoredBinaryTrees(int[] arr) {
        // Sort the array to ensure that we only encounter factors that have already been processed
        Arrays.sort(arr);
        
        // Use a map to store the index of each integer in the array for faster lookup
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++) {
            map.put(arr[i], i);
        }
        
        // Iniatialize an array tp store the number of biary trees that can be formed
        // using each integer as the root
        long[] dp = new long[arr.length];
        Arrays.fill(dp, 1);
        
        // Compute the number of binary trees that can be formed using each integer as the root
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < i; j++) {
                if(arr[i] % arr[j] == 0) {
                    int k = arr[i] / arr[j];
                    if(map.containsKey(k)) {
                        dp[i] += dp[j] * dp[map.get(k)];
                    }
                }
            }
        }
        
        long count = 0;
        for(long n : dp) {
            count += n;
        }
        
        return (int) (count % (long)(1e9 + 7));
    }
    
}