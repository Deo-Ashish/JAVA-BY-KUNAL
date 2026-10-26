class Solution {
    public String restoreString(String s, int[] indices) {
        // 1. Create a character array to hold the restored string
        char[] restored = new char[s.length()];
        
        // 2. Place each character at its correct target index
        for (int i = 0; i < s.length(); i++) {
            restored[indices[i]] = s.charAt(i);
        }
        
        // 3. Convert the character array back to a String
        return new String(restored);
    }
}
