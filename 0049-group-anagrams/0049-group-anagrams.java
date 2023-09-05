class Solution {

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, ArrayList<String>> map = new HashMap<>();
        for(String s : strs) {
            char[] chars = new char[26];
            for (char c : s.toCharArray()) {
                chars[c - 'a']++;
            }
            String keyStr = String.valueOf(chars);
            ArrayList<String> anagrams = map.getOrDefault(keyStr, new ArrayList<String>());
            anagrams.add(s);
            map.put(keyStr, anagrams);
        }
        return new ArrayList<>(map.values());
    }
}
