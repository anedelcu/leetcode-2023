class Solution {

    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        for(int num : nums1) {
            set1.add(num);
        }
        Set<Integer> set2 = new HashSet<>();
        for(int num : nums2) {
            set2.add(num);
        }
        Iterator<Integer> it = set1.iterator();
        set1.retainAll(set2);
        int[] result = new int[set1.size()];
        int i = 0;
        for(int num : set1) {
            result[i] = num;
            i++;
        }
        return result;
    }
}
