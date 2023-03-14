class Solution {

    public String reverseWords(String s) {
        // trim leading and trailing spaces
        s = s.trim();
        // split words by one or more spaces
        String[] words = s.split("\\s+");
        // reverse the array of words
        Collections.reverse(Arrays.asList(words));
        // join the reversed words with a single space and return the result
        return String.join(" ", words);
    }
}
