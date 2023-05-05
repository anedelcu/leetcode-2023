class Solution {

    /*
    sliding window approch
    count vowels in the first k chars
    if vowels == k return k
    iterate though the rest of the string
    if the ch.charaAT(end) is vowels count++;
    if the ch.charaAT(start) is vowels count--;
    count = max(count, new count)
    if vowels == k return k
    
    
    */
    public int maxVowels(String s, int k) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        if (k > s.length()) {
            k = s.length();
        }
        int count = 0;
        int start = 0;
        int end = k;
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');
        for (int i = 0; i < k; i++) {
            char c = s.charAt(i);
            if (vowels.contains(c)) {
                count++;
            }
        }
        if (count == k) {
            return count;
        }
        int newCount = count;
        for (end = k; end < s.length(); end++) {
            char rightChar = s.charAt(end);
            if (vowels.contains(rightChar)) {
                newCount++;
            }
            char leftChar = s.charAt(start++);
            if (vowels.contains(leftChar)) {
                newCount--;
            }
            count = Math.max(count, newCount);
            if (count == k) {
                return count;
            }
        }

        return count;
    }
}
