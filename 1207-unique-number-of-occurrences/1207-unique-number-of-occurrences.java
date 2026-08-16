class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> arrayMap = new HashMap<>();
        Set<Integer> uniqueSet = new HashSet<>();

        for (int num : arr) {
            arrayMap.put(num, arrayMap.getOrDefault(num, 0) + 1);
        }

        for (int frequency : arrayMap.values()) {
            if (!uniqueSet.add(frequency)) {
                return false;
            }
        }

        return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna