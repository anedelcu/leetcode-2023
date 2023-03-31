class MapSum {
    
    private List<String> keys;
    private List<Integer> values;

    public MapSum() {
        keys = new ArrayList<>();
        values = new ArrayList<>();
    }
    
    public void insert(String key, int val) {
        int index = keys.indexOf(key);
        if(index != -1) {
            values.set(index, val);
        }
        else {
            keys.add(key);
            values.add(val);
        }
        
    }
    
    public int sum(String prefix) {
        int size = prefix.length();
        int sum = 0;
        for(int i = 0; i < keys.size(); i++) {
            if(keys.get(i).length() >= size && keys.get(i).substring(0, size).equals(prefix)) {
                sum += values.get(i);
            }
        }
        return sum;
    }
}

/**
 * Your MapSum object will be instantiated and called as such:
 * MapSum obj = new MapSum();
 * obj.insert(key,val);
 * int param_2 = obj.sum(prefix);
 */