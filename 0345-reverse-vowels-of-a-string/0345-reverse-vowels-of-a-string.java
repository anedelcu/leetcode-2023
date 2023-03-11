class Solution {

    public String reverseVowels(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (isVowel(c)) {
                sb.append(c);
            }
        }
        System.out.println(sb.toString());
        String onlyVowels = sb.reverse().toString();
        int i = 0;
        char[] sArray = s.toCharArray();
        for (int j = 0; j < sArray.length; j++) {
            if (isVowel(sArray[j])) {
                sArray[j] = onlyVowels.charAt(i);
                i++;
            }
        }
        String result = String.copyValueOf(sArray);
        return result;
    }

    private boolean isVowel(char c) {
        String VOWELS = "aeiouAEIOU";
        return VOWELS.indexOf(c) != -1;
    }
}
