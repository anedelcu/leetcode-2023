class Solution {
    public long countVowels(String word) {
        
        long res = 0;
        int n = word.length();
        for(int i = n - 1; i >= 0; i--) {
            //char c = ;
            if(isVowel(word.charAt(i))) {
                res += (long) (i + 1) * (n - i);
            }
        }
        return res;
    }
    
    
    private static boolean isVowel(char c) {
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            return true;
        }
        return false;                                             
    }
}