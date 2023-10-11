public class Solution {

    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length();
        int[] freq1 = new int[26];
        int m =s2.length();
        int[] freq2 = new int[26];
        for(int i = 0; i < n; i++) {
            char c = s1.charAt(i);
            freq1[c - 'a']++;
        }
        for(int i = 0; i < m; i++) {
            char c = s2.charAt(i);
            freq2[c - 'a']++;
            if(i >= n) {
                freq2[s2.charAt(i - n) - 'a']--;
            }
            if(Arrays.equals(freq1, freq2)) {
                return true;
            }
        }
        return false;
    }
    
    private static void printLetters(int[] freq1, int[] freq2) {
        for(int i = 0; i < 26; i++) {
            System.out.print((char)(i + 'a') + " ");
        }
        System.out.println();
        for(int i = 0; i < 26; i++) {
            System.out.print(freq1[i] + " ");
        }
        System.out.println();
        for(int i = 0; i < 26; i++) {
            System.out.print(freq2[i] + " ");
        }
        System.out.println();
    }
}
