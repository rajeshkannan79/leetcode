class Solution {
    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
        return isSameColor(coordinate1, coordinate2);
    }

    private boolean isSameColor(String a, String b) {
       
        int columnA = a.charAt(0) - 'a' + 2;
        int rowA = a.charAt(1) - '0'; 
        
        int columnB = b.charAt(0) - 'a' + 2; 
        int rowB = b.charAt(1) - '0';

       
        return (rowA + columnA) % 2 == (rowB + columnB) % 2;
    }
}
