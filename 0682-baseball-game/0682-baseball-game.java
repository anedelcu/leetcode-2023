class Solution {

    public int calPoints(String[] operations) {
        List<Integer> score = new ArrayList<>();
        for (String op : operations) {
            if (op.equals("C")) {
                score.remove(score.size() - 1);
            } else if (op.equals("D")) {
                int newScore = score.get(score.size() - 1) * 2;
                score.add(newScore);
            } else if (op.equals("+")) {
                int newScore = score.get(score.size() - 1) + score.get(score.size() - 2);
                score.add(newScore);
            } else {
                score.add(Integer.valueOf(op));
            }
        }
        int sum = 0;
        for (int num : score) {
            sum += num;
        }
        return sum;
    }
}
