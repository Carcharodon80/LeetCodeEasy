/**
 * 9. Palindrome Number
 * Given an integer x, return true if x is palindrome integer.
 * An integer is a palindrome when it reads the same backward as forward.
 * For example, 121 is palindrome while 123 is not.
 */

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        String temp = String.valueOf(x);
        String z = new StringBuilder(temp).reverse().toString();
        return temp.equals(z);
    }
}
