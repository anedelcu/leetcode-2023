class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        String s = paragraph.replaceAll("[^a-zA-Z0-9 ]", " ").toLowerCase();
        String[] sArray = s.split("\\s+");
        Set<String> set = new HashSet<>();
        for(String word: banned) {
            set.add(word);
        }
        Map<String, Integer> map = new HashMap<>();
        for(String word : sArray) {
            if(!set.contains(word)) {
                map.put(word, map.getOrDefault(word, 0) + 1);
            }
        }
        
        return Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
    }
}