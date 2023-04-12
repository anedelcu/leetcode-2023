import java.util.*;

class Solution {

    public String shortestCompletingWord(String licensePlate, String[] words) {
        // Preprocess licensePlate string
        licensePlate = licensePlate.toLowerCase();
        licensePlate = licensePlate.replaceAll("[^a-z]", "");

        // Initialize shortest completing word to null and maximum length to infinity
        String shortestWord = null;
        int maxLength = Integer.MAX_VALUE;

        // Iterate through each word in words array
        for (String word : words) {
            // Check if word contains all characters in licensePlate
            String tempLicensePlate = licensePlate;
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                if (tempLicensePlate.indexOf(c) != -1) {
                    tempLicensePlate = tempLicensePlate.replaceFirst(String.valueOf(c), "");
                    if (tempLicensePlate.isEmpty()) {
                        // All characters in licensePlate found in word
                        if (word.length() < maxLength) {
                            shortestWord = word;
                            maxLength = word.length();
                        }
                        break;
                    }
                }
            }
        }

        return shortestWord;
    }
}
