class Solution {
    public String addSpaces(String s, int[] spaces) {int k=0;String d="";
      StringBuilder result = new StringBuilder();
        int spaceIndex = 0;
        
        // Traverse the string s and insert spaces as required
        for (int i = 0; i < s.length(); i++) {
            // Insert space at the current index if it is in the 'spaces' array
            if (spaceIndex < spaces.length && i == spaces[spaceIndex]) {
                result.append(' ');  // Insert space
                spaceIndex++;
            }
            result.append(s.charAt(i));  // Always append the current character
        }
        
        return result.toString();
    }
}