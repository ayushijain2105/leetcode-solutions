class Solution {
    public int maxRepeating(String sequence, String word) {
        int k =0;
        String curr = word;
        while(sequence.contains(curr)){
            k++;
            curr+= word;
        }
        return k;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna