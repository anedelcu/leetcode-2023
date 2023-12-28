import java.util.Arrays;

class Solution {

    public int[] sortByBits(int[] arr) {
        sortAfterNumberOfOneBits(arr);
        return arr;
    }

    private static int getNumberOfOnes(int n) {
        int res = 0;
        while (n != 0) {
            res++;
            n = n & (n - 1);
        }
        return res;
    }

    private static void sortAfterNumberOfOneBits(int[] arr) {
        Integer[] boxedArr = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(boxedArr, (a, b) -> {
            int bitCountA = getNumberOfOnes(a);
            int bitCountB = getNumberOfOnes(b);
            if (bitCountA != bitCountB) {
                return bitCountA - bitCountB;
            } else {
                return a - b;
            }
        });
        for (int i = 0; i < arr.length; i++) {
            arr[i] = boxedArr[i];
        }
    }
}
