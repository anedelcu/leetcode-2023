class Solution {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        int n = candies.length;
        List<Boolean> res = new ArrayList<>();
        for (int c : candies) {
            if (c >= max) {
                max = c;
            }
        }
        for (int i = 0; i < n; i++) {
            if (candies[i] + extraCandies >= max) {
                res.add(true);
            } else {
                res.add(false);
            }
        }
        return res;
    }
}
