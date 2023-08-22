class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        int count = 0;
        for(int i = 0; i < words.length - 1; i++) {
            for(int j = i + 1; j < words.length; j++) {
                if(words[i].equals(reverse(words[j]))) {
                    count++;
                    break;
                }
            }
        }
        return count;
        
    }
    
    public String reverse(String s) {
        int i = 0;
        int j = s.length() - 1;
        char[] ch = s.toCharArray();
        while(i < j) {
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
            i++;
            j--;
        }
        return String.valueOf(ch);
    }
}