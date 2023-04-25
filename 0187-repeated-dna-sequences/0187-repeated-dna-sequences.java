class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> result = new ArrayList<>();
        if(s.length() <= 10) {
            return result;
        }
        HashMap<String,Integer> map = new HashMap();
        StringBuilder sb = new StringBuilder();
        sb.append(s.substring(0,10));
        map.put(sb.toString(), map.getOrDefault(sb.toString(), 0) + 1);
        for(int i = 10; i < s.length(); i++) {
            char c = s.charAt(i);
            sb.append(c);
            sb.deleteCharAt(0);
            map.put(sb.toString(), map.getOrDefault(sb.toString(), 0) + 1);
        }
        for(String key : map.keySet()) {
            if(map.get(key) >= 2) {
                result.add(key);
            }
        }
        return result;
        
    }
}