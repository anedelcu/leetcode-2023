class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        
        for(int i = 0; i < words.length - 1; i++) {
            String word1 = words[i];
            String word2 = words[i + 1];
            for(int j = 0; j < word1.length(); j++) {
                if(j == word2.length()) {
                    return false;
                }
                char c1 = word1.charAt(j);
                char c2 = word2.charAt(j);
                System.out.println(order.indexOf(c1));
                System.out.println(order.indexOf(c2));
                if(order.indexOf(c1) > order.indexOf(c2) ) {
                    return false;
                }
                else if(c1 != c2){
                    break;
                }
                
            }
        }
        return true;
    }
}