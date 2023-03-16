class Solution {

    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int start = 0;
        int end =  0;
        int longest  = 0;
        for(end = 0; end < s.length(); end++) {
            char c = s.charAt(end);
            
            while(set.contains(c)){
                set.remove(s.charAt(start));
                start++;
            }
            set.add(c);
            longest = Math.max(longest, set.size());
        }
        return longest;
    }
}
