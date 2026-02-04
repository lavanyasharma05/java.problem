class Solution {
    public int getMinDiff(int[] arr, int k) {
        int n = arr.length;
        if (n == 1) return 0;

        Arrays.sort(arr);

        int ans = arr[n - 1] - arr[0];

        for (int i = 0; i < n - 1; i++) {
            int leftTall = arr[i] + k;
            int rightShort = arr[i + 1] - k;
            if (rightShort < 0) continue;
            int maxH = (arr[n - 1] - k > leftTall) ? arr[n - 1] - k : leftTall;
            int minH = (arr[0] + k < rightShort) ? arr[0] + k : rightShort;

            int currentDiff = maxH - minH;
            if (currentDiff < ans) {
                ans = currentDiff;
            }
        }

        return ans;
    }
}
