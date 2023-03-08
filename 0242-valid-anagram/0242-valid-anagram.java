class Solution {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (char ch : t.toCharArray()) {
            if(!map.containsKey(ch)){
                return false;
            }
            int freq = map.get(ch);
            if(freq == 1) {
                map.remove(ch);
            }
            else {
                map.put(ch, freq - 1);
            }
        }
        
        return map.isEmpty();
    }
}
