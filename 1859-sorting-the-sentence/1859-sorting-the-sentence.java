class Solution {
    public String sortSentence(String s) {
        String[] sArray = s.split(" ");
        StringBuilder sb = new StringBuilder();
        String[] sRes = new String[sArray.length];
        for(String  word : sArray) {
            int index = Character.getNumericValue(word.charAt(word.length() - 1));
            sRes[index - 1] = word.substring(0, word.length() - 1);
        }
        for(String word : sRes) {
            sb.append(word);
            sb.append( " " );
        }
        return sb.toString().trim();
    }
}