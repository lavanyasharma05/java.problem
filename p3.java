class Solution {
    public int minJumps(int[] arr) {
        int n = arr.length;
        if (n <= 1) return 0;
        if (arr[0] == 0) return -1;

        int c = 1;      // jumps
        int a = arr[0]; // max reach
        int b = arr[0]; // steps left

        for (int i = 1; i < n - 1; i++) {
            // Update 'a' if this tile lets us go further
            if (i + arr[i] > a) {
                a = i + arr[i];
            }

            b--; // use a step

            if (b == 0) {
                c++; // must jump
                
                if (i >= a) return -1; // stuck!
                
                b = a - i; // refill steps
            }
        }
        return c;
    }
}
