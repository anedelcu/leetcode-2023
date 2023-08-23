class Solution {

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, ArrayList<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String sortedS = new String(chars);

            if (!map.containsKey(sortedS)) {
                map.put(sortedS, new ArrayList<>());
            }
            map.get(sortedS).add(s);
        }

        return new ArrayList<>(map.values());
    }
}
