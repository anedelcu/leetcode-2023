class Solution {

    public boolean canConstruct(String ransomNote, String magazine) {
        int[] count = new int[26]; // to keep track of frequency of each letter in magazine
        for (int i = 0; i < magazine.length(); i++) {
            count[magazine.charAt(i) - 'a']++; // increment frequency of the corresponding letter
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            int index = ransomNote.charAt(i) - 'a'; // get the index of the current letter in ransomNote
            if (count[index] <= 0) {
                return false; // if frequency of this letter is already zero, we can't construct ransomNote
            }
            count[index]--; // decrement frequency of the corresponding letter in magazine
        }
        return true;
    }
}
