public class Palindrome {

    /**
     *Given a string, finds if the string is a palindrome or not.
     * @param string
     * @return boolean representing if the string is a palindrome or not
     */
    public static boolean isPalindrome(String string) {
        if (string.length() == 0 || string.length() == 1) {
            return true;
        }
        if (string.charAt(0) == string.charAt(string.length() - 1)) {
            return isPalindrome(string.substring(1, string.length() - 1));
        }
        return false;
    }
}
