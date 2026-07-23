class Solution {
    public boolean isPalindrome(int x) {

        if (x < 0) return false;

        String s = String.valueOf(x);
        String reverse = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            reverse += s.charAt(i);
        }

        return s.equals(reverse);
    }
}