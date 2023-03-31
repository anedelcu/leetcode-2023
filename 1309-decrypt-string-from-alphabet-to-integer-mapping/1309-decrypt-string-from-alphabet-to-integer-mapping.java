class Solution {
    public String freqAlphabets(String s) {
        if(s.length() == 1) {
            return String.valueOf((char)(Integer.valueOf(s) + 'a' - 1));  
        }
        if(s.length() == 2) {
            return String.valueOf((char)(Integer.valueOf(s) / 10 + 'a' - 1)) +
                String.valueOf((char)(Integer.valueOf(s) % 10 + 'a' - 1));  
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for(i = 2; i < s.length(); i++) {
            if(s.charAt(i) == '#') {
                sb.append(String.valueOf((char)(Integer.valueOf(s.substring(i - 2, i)) + 'a' - 1)));
                i = i + 2;
            }
            else {
                sb.append(String.valueOf((char)(Integer.valueOf(s.substring(i - 2, i - 1)) + 'a' - 1)));
            }
            System.out.println(i);
        }
        System.out.println(i);
        i = i - 2;
        System.out.println(i);
        while(i < s.length()) {
            sb.append(String.valueOf((char)(Integer.valueOf(s.substring(i, i + 1)) + 'a' - 1)));
            i++;
        }
        return sb.toString();
    }
}