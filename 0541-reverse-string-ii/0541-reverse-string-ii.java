class Solution {

    public String reverseStr(String s, int k) {
        char[] sChar = s.toCharArray();
        for(int i = 0; i < s.length(); i = i + k) {
            if(i + k <= s.length()) {
                reverse(sChar, i, i + k - 1);
                i = i + k;
            }
            else {
                System.out.println("in esle block");
                reverse(sChar, i, s.length() - 1);
                //i = i + k;
            }
        }
        return new String(sChar);
    }

    private void reverse(char[] arr, int left, int right) {
        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}
