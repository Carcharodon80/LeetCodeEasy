import java.util.LinkedList;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        int minWordLength = 200;
        for (String word : strs) {
            if (minWordLength > word.length()) {
                minWordLength = word.length();
            }
        }
        String rsl = "";
        boolean isCommon = true;
        for (int i = 0; i < minWordLength; i++) {
            for (String word : strs) {
                if (word.charAt(i) != strs[0].charAt(i)) {
                    isCommon = false;
                    break;
                }
            }
            if (isCommon) {
                rsl += strs[0].charAt(i);
            } else {
                break;
            }
        }
        return rsl;
    }
}
