class Solution {

    public int[] intersect(int[] nums1, int[] nums2) {
        // Create hash maps to store the frequency of each element in the arrays
        Map<Integer, Integer> map1 = new HashMap<>();
        Map<Integer, Integer> map2 = new HashMap<>();

        // Fill the hash maps with the frequency of each element in the arrays
        for (int num : nums1) {
            map1.put(num, map1.getOrDefault(num, 0) + 1);
        }
        for (int num : nums2) {
            map2.put(num, map2.getOrDefault(num, 0) + 1);
        }

        // Create a list to store the common elements
        List<Integer> list = new ArrayList<>();
        for (int num : map1.keySet()) {
            if (map2.containsKey(num)) {
                // Get the minimum frequency of the common element in both arrays
                int minFreq = Math.min(map1.get(num), map2.get(num));
                // Add the common element to the list minFreq times
                for (int i = 0; i < minFreq; i++) {
                    list.add(num);
                }
            }
        }

        // Convert the list to an array and return it
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}
