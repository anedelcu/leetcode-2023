class Trie {
    
    private String word;
    private List<String> list;

    public Trie() {
        this.word ="";
        this.list = new ArrayList<>();
    }
    
    public void insert(String word) {
        this.list.add(word);
    }
    
    public boolean search(String word) {
        return list.contains(word);
        
    }
    
    public boolean startsWith(String prefix) {
        int n = prefix.length();
        for(String word : list) {
            if(word.length() >= n && word.substring(0, n).equals(prefix)){
                return true;
            }
        }
        return false;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */