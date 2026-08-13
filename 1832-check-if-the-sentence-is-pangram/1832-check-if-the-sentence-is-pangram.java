class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean[] freq = new boolean[26];

        for (char ch : sentence.toCharArray()) {
            freq[ch - 'a'] = true;
        }

        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (!freq[ch - 'a']) {
                return false;
            }
        }
        return true;
    }
}