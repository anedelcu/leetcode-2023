class Solution {

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, ArrayList<String>> map = new HashMap<>();
        for(String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String sortedS = new String(chars);
            ArrayList<String> anagrams = map.getOrDefault(sortedS, new ArrayList<String>());
            anagrams.add(s);
            map.put(sortedS, anagrams);
        }
        return new ArrayList<>(map.values());
    }
}
