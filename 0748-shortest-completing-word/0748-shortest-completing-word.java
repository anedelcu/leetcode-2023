class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        //Map<Character, Integer> mapLp = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        for(char c : licensePlate.toCharArray()) {
            if(Character.isLetter(c)) {
                //mapLp.put(c, map.getOrDefault(c, 0) + 1);
                sb.append(c);
            }
        }
        String lp = sb.toString().toLowerCase();
        Arrays.sort(words, (a, b)->Integer.compare(a.length(), b.length()));
        for(String word : words) {
            if(isCompleting(lp, word)) {
                return word;
            }
        }
        return "";
    }
    
    public boolean isCompleting(String lp, String w) {
        if(lp.length() > w.length()) {
            return false;
        }
        Map<Character, Integer> map = new HashMap<>();
        for(char c : w.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for(char c : lp.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) - 1);
        }
        for(int n : map.values()) {
            if(n < 0) {
                return false;
            }
        }
        return true;
    }
}