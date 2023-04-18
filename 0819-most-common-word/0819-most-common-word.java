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
        int max = 0;
        String result = "";
        for(String key : map.keySet()) {
            if(map.get(key) > max){
                max = map.get(key);
                result = new String(key);
            }
        }
        return result;
    }
}