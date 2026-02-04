class Solution {
    public int[][] merge(int[][] arr) {
        int n = arr.length;
        if (n <= 1) return arr;
        for (int i = 0; i < n; i++) {
            for (int k = i + 1; k < n; k++) {
                
                if (arr[i][0] > arr[k][0]) {
                    int[] temp = arr[i];
                    arr[i] = arr[k];
                    arr[k] = temp;
                }
            }
        }

        int j = 0; 
        for (int i = 1; i < n; i++) {
            if (arr[i][0] <= arr[j][1]) {
                if (arr[i][1] > arr[j][1]) {
                    arr[j][1] = arr[i][1];
                }
            } else {
                j++;
                arr[j] = arr[i];
            }
        }
        int[][] result = new int[j + 1][2];
        for (int i = 0; i <= j; i++) {
            result[i] = arr[i];
        }

        return result;
    }
}
