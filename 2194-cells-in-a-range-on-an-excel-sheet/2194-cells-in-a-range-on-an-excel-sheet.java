class Solution {
    public List<String> cellsInRange(String s) {
        List<String> result = new ArrayList<>();
        char[] sArr = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i = sArr[0]; i <= sArr[3]; i++) {
            sb.append(String.valueOf((char)i));
            for(int j = sArr[1]; j <= sArr[4]; j++) {
                sb.append(String.valueOf(Character.getNumericValue(j)));
                result.add(sb.toString());
                sb.setLength(1);
            }
            sb.setLength(0);
        }
        return result;
    }
}