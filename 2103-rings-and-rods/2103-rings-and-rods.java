class Solution {

    public int countPoints(String rings) {
        int res = 0;
        Map<Character, Set<Character>> map = new HashMap<>();
        for(int i = 1; i < rings.length(); i+=2) {
            char rod = rings.charAt(i);
            char ring = rings.charAt(i - 1);
            Set<Character> set = map.getOrDefault(rod, new HashSet<>());
            set.add(ring);
            map.put(rod, set);
        }
        for(Set<Character> s : map.values()) {
            if(s.size() == 3) {
                res++;
            }
        }
        return res;
    }
}
