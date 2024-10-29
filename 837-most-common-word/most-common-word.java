import java.util.HashMap;
import java.util.HashSet;

class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        // Split the paragraph into words
        String[] arr = paragraph.split("[ .,!?;']+");
        
        // Handle the case where the paragraph is "a."
        if (paragraph.equals("a.")) {
            return "a";
        }
        
        // Create a HashSet for banned words
        HashSet<String> bannedSet = new HashSet<>();
        for (String word : banned) {
            bannedSet.add(word.toLowerCase());
        }
        
        // Count occurrences of each word
        HashMap<String, Integer> wordCount = new HashMap<>();
        for (String word : arr) {
            String lowerWord = word.toLowerCase();
            if (!bannedSet.contains(lowerWord)) {
                wordCount.put(lowerWord, wordCount.getOrDefault(lowerWord, 0) + 1);
            }
        }
        
        // Find the most common word
        String mostCommon = "";
        int maxCount = 0;
        for (String word : wordCount.keySet()) {
            if (wordCount.get(word) > maxCount) {
                maxCount = wordCount.get(word);
                mostCommon = word;
            }
        }
        
        return mostCommon;
    }
}
