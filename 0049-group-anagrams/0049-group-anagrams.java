class Solution {

    public List<List<String>> groupAnagrams(String[] strs) {
        List<ArrayList<String>> res = new ArrayList<>();
        Map<String, ArrayList<String>> map = new HashMap<>();
        for(int i = 0; i < strs.length; i++) {
            char[] s = strs[i].toCharArray();
            Arrays.sort(s);
            String key = String.valueOf(s);
            ArrayList<String> anagrams = map.getOrDefault(key,  new ArrayList<String>());
            anagrams.add(strs[i]);
            map.put(key, anagrams);
        }
        return new ArrayList<>(map.values());
    }
    
    private boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }
        int[] chars = new int[26];
        for(char c : s.toCharArray()) {
            chars[c - 'a']++;
        }
        for(char c : t.toCharArray()) {
            chars[c - 'a']--;
        }
        for(int n : chars) {
            if(n != 0) {
                return false;
            }
        }
        return true;
    }
}
