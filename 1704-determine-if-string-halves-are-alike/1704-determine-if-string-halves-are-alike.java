class Solution {

    public boolean halvesAreAlike(String s) {
        int count1 = 0;
        int count2 = 0;
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (isVowel(s.charAt(i))) {
                count1++;
            }
            if (isVowel(s.charAt(j))) {
                count2++;
            }
            i++;
            j--;
        }
        return count1 == count2;
    }

    private boolean isVowel(char c) {
        Set<Character> set = new HashSet<>() {

            {
                add('a');
                add('e');
                add('i');
                add('o');
                add('u');
                add('A');
                add('E');
                add('I');
                add('O');
                add('U');
            }
        };
        return set.contains(c);
    }
}
