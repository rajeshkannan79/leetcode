class Solution {
    public int passThePillow(int n, int time) {
         int pos = 1; 
        boolean forward = true; 

        while (time > 0) {
            if (forward) {
                pos++;
                if (pos == n) {
                    forward = false;
                }
            } else {
                pos--;
                if (pos == 1) {
                    forward = true;
                }
            }
            time--;
        }
        return pos;
    }
}