class Solution {

    public String convert(String s, int numRows) {
        if (numRows == 1 || numRows >= s.length()) {
            return s;
        }
        StringBuilder[] sb = new StringBuilder[numRows];
        for (int i = 0; i < sb.length; i++) {
            sb[i] = new StringBuilder();
        }
        int i = 0;
        int direction = 1;
        for (char c : s.toCharArray()) {
            sb[i].append(c);
            if (i == 0) {
                direction = 1;
            }
            else if (i == numRows - 1) {
                direction = -1;
            }
            i = i + direction;
        }
        StringBuilder result = new StringBuilder();
        for (StringBuilder row : sb) {
            result.append(row);
        }
        return result.toString();
    }
}
