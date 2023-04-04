class Solution {
    public int partitionString(String s) {
        int[] lettersSeen = new int[26];
        Arrays.fill(lettersSeen, -1);
        int count = 1;
        int start = 0;
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(lettersSeen[c - 'a'] >= start) {
                count++;
                start = i;
            }
            lettersSeen[c - 'a'] = i;
        }
        return count;
    }
}