import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PalindromeTest {

    @Test
    public void palindromeTest() {
        assertTrue(Palindrome.isPalindrome("abba"));
        assertFalse(Palindrome.isPalindrome("baba"));
    }
}
