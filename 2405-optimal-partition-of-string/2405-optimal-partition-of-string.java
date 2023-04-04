class Solution {

    public int partitionString(String s) {
        int count = 1;
        Set<Character> charSet = new HashSet<>();
        for (char ch : s.toCharArray()) {
            if (!charSet.contains(ch)) {
                charSet.add(ch);
            } else {
                count++;
                charSet.clear();
                charSet.add(ch);
            }
        }
        return count;
    }
}
