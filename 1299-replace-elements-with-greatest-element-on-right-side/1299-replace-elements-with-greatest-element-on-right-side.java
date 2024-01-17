class Solution {

    public int[] replaceElements(int[] arr) {
        int rightMax = -1;
        for (int i = arr.length - 1; i >= 0; i--) {
            if(arr[i] > rightMax) {
                int newMax = Math.max(rightMax, arr[i]);
            arr[i] = rightMax;
            rightMax = newMax;
            }
            else {
                arr[i] = rightMax;
            }
            
        }
        return arr;
    }
}
