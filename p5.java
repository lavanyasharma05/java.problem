class Solution {
    public void mergeArrays(int[] a, int[] b) {
        int n = a.length;
        int m = b.length;
        int totalSize = n + m;

        int gap = (totalSize / 2) + (totalSize % 2);

        while (gap > 0) {
            int i = 0;
            int j = gap;

            while (j < totalSize) {
                if (i < n && j < n) {
                    if (a[i] > a[j]) {
                        int temp = a[i]; a[i] = a[j]; a[j] = temp;
                    }
                } 
                else if (i < n && j >= n) {
                    if (a[i] > b[j - n]) { 
                        int temp = a[i]; a[i] = b[j - n]; b[j - n] = temp;
                    }
                } 
                else if (i >= n && j >= n) {
                    if (b[i - n] > b[j - n]) {
                        int temp = b[i - n]; b[i - n] = b[j - n]; b[j - n] = temp;
                    }
                }
                
                i++; 
                j++;
            }
            if (gap == 1) break;
            gap = (gap / 2) + (gap % 2);
        }
    }
}
