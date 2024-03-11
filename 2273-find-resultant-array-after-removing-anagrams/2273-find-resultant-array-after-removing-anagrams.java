class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> res = new ArrayList<>();
        int left = 0;
        int right = 1;
        while(left < words.length) {
            res.add(words[left]);
            while(right < words.length && isAnagram(words[left], words[right])) {
                right++;
            }
            left = right;
        }
        return res;
    }
    
    private boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }
        int chars[] = new int[26];
        for(char c : s.toCharArray()) {
            chars[c - 'a']++;
        }
         for(char c : t.toCharArray()) {
            chars[c - 'a']--;
        }
        for( int n : chars) {
            if(n != 0) {
                return false;
            }
        }
        return true;
    }
}