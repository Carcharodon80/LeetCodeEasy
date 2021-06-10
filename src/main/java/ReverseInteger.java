/**
 * 7. Reverse Integer
 */
public class ReverseInteger {
    public int reverse(int x) {
        String rsl = "";
        char[] chars = String.valueOf(x).toCharArray();
        if (chars[0] == '-') {
            rsl += '-';
            char[] newChars = new char[chars.length - 1];
            System.arraycopy(chars, 1, newChars, 0, newChars.length);
            for (int i = newChars.length - 1; i >= 0; i--) {
                rsl += newChars[i];
            }
        } else {
            for (int i = chars.length - 1; i >= 0; i--) {
                rsl += chars[i];
            }
        }
        try {
            return Integer.parseInt(rsl);
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}
