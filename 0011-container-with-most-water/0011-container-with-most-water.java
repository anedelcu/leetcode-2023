class Solution {
    public int maxArea(int[] height) {
        // brute force
        int area = 0;
        int left = 0;
        int right = height.length - 1;
        while(left < right) {
            int h = Math.min(height[left], height[right]);
            int w = right - left;
            area = Math.max(area, w * h);
            if(height[left] <= height[right]) {
                left++;
            }
            else {
                right--;
            }
        }
        return area;
    }
}