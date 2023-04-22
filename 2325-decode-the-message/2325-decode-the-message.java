class Solution {
    public String decodeMessage(String key, String message) {
        Map<Character, Character> table = createTable(key);
        StringBuilder decodedMessage = new StringBuilder();
        for (char c : message.toCharArray()) {
            if (c == ' ') {
                decodedMessage.append(' ');
            } else if (table.containsKey(c)) {
                decodedMessage.append(table.get(c));
            } else {
                decodedMessage.append(c);
            }
        }
        return decodedMessage.toString();
    }
    
    private static Map<Character, Character> createTable(String key) {
        Map<Character, Character> table = new HashMap<>();
        int idx = 0;
        for (char c : key.toCharArray()) {
            if (Character.isLowerCase(c)) {
                if (!table.containsKey(c)) {
                    table.put(c, (char) ('a' + idx++));
                }
            }
        }
        for (int i = 0; i < 26; i++) {
            char c = (char) ('a' + i);
            if (!table.containsValue(c)) {
                table.put((char) ('a' + idx++), c);
            }
        }
        return table;
    }
}