public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        String temp = String.valueOf(x);
        String z = new StringBuilder(temp).reverse().toString();
        return temp.equals(z);
    }
}
