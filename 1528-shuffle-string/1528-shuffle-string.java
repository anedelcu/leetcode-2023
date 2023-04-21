class Solution {
    public String restoreString(String s, int[] indices) {
        char[] sArray = new char[s.length()];
        for(int i = 0; i < sArray.length; i++) {
            sArray[indices[i]] = s.charAt(i);
        }
        return new String(sArray);
    }
}