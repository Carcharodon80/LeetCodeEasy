/**
 * 13. Roman to Integer
 */
public class RomanToInteger {
    public int romanToInt(String s) {
        int rsl = 0;
        char[] array = (s + "0").toCharArray();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 'I' && array[i + 1] == 'V') {
                rsl += 4;
                i++;
            } else if (array[i] == 'I' && array[i + 1] == 'X') {
                rsl += 9;
                i++;
            } else if (array[i] == 'I') {
                rsl += 1;
            } else if (array[i] == 'V') {
                rsl += 5;
            } else if (array[i] == 'X' && array[i + 1] == 'L') {
                rsl += 40;
                i++;
            } else if (array[i] == 'X' && array[i + 1] == 'C') {
                rsl += 90;
                i++;
            } else if (array[i] == 'X') {
                rsl += 10;
            } else if (array[i] == 'L') {
                rsl += 50;
            } else if (array[i] == 'C' && array[i + 1] == 'D') {
                rsl += 400;
                i++;
            } else if (array[i] == 'C' && array[i + 1] == 'M') {
                rsl += 900;
                i++;
            } else if (array[i] == 'C') {
                rsl += 100;
            } else if (array[i] == 'D') {
                rsl += 500;
            } else if (array[i] == 'M') {
                rsl += 1000;
            }
        }
        return rsl;
    }
}
