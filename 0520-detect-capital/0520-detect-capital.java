class Solution {

    public boolean detectCapitalUse(String word) {
        char firstChar = word.charAt(0);
        if (word.length() == 1) {
            return true;
        }
        if (Character.isUpperCase(firstChar)) {
            char secondChar = word.charAt(1);
            if (Character.isUpperCase(secondChar)) {
                for (int i = 2; i < word.length(); i++) {
                    char c = word.charAt(i);
                    if (Character.isLowerCase(c)) {
                        return false;
                    }
                }
            } else if (Character.isLowerCase(secondChar)) {
                for (int i = 2; i < word.length(); i++) {
                    char c = word.charAt(i);
                    if (Character.isUpperCase(c)) {
                        return false;
                    }
                }
            }
        } else {
            for (int i = 1; i < word.length(); i++) {
                char c = word.charAt(i);
                if (Character.isUpperCase(c)) {
                    return false;
                }
            }
        }
        return true;
    }
}
