class Solution {
    public boolean judgeCircle(String moves) {
        int[] origin = new int[2];
        for(char c : moves.toCharArray()) {
            if(c == 'R') {
                origin[0]++;
            }
            else if(c == 'L') {
                origin[0]--;
            }
            else if(c == 'U') {
                origin[1]++;
            }
            else {
                origin[1]--;
            }
        }
        return origin[0] == 0 && origin[1] == 0;
        
    }
}