class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Map<Character, String> map = new HashMap<>();
        char ch = 'a';
        for(String s : morse) {
            map.put(ch, s);
            ch++;
        }
        Set<String> set = new HashSet<>();
        for(String word : words) {
            StringBuilder sb = new StringBuilder();
            for(char c : word.toCharArray()) {
                sb.append(map.get(c));
            }
            set.add(sb.toString());
            sb.setLength(0);
        }
        return set.size();
    }
}