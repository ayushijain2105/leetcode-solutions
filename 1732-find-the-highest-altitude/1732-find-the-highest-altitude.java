class Solution {
    public int largestAltitude(int[] gain) {
        int maxHeight = 0;
        int currHeight = 0;

        for (int g : gain) {
            currHeight += g;
            maxHeight = Math.max(maxHeight, currHeight);
        }

        return maxHeight;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna