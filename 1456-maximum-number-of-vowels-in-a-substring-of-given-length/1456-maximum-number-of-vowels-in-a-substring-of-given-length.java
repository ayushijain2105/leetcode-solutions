class Solution {
    public int maxVowels(String s, int k) {

        int n = s.length();
        int vowelCount = 0;

        for (int i = 0; i < k; i++) {
            char ch = s.charAt(i);

            if (ch == 'a' || ch == 'i' || ch == 'o' || ch == 'e' || ch == 'u')
                vowelCount++;
        }

        int maxVowelCount = vowelCount;

        for (int i = 1; i <= n - k; i++) {

            char ch = s.charAt(i - 1);
            if (ch == 'a' || ch == 'i' || ch == 'o' || ch == 'e' || ch == 'u')
                vowelCount--;

            ch = s.charAt(i + k - 1);
            if (ch == 'a' || ch == 'i' || ch == 'o' || ch == 'e' || ch == 'u')
                vowelCount++;

            maxVowelCount = Math.max(maxVowelCount, vowelCount);
        }

        return maxVowelCount;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna