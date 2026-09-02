class Solution {
    public boolean isPalindrome(String s) {
        String clean = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversed = new StringBuilder(clean).reverse().toString();
        if(clean.equalsIgnoreCase(reversed)){
            return true;
        }
        return false;
    }
}
