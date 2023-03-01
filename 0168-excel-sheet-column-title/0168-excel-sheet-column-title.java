class Solution {

    public String convertToTitle(int columnNumber) {
        StringBuilder result = new StringBuilder();
        while (columnNumber > 0) {
            columnNumber--;
            int remainder = columnNumber % 26;
            result.insert(0, (char) (remainder + 'A'));
            columnNumber /= 26;
        }
        return result.toString();
    }
}
