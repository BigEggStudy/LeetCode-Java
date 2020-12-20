//-----------------------------------------------------------------------------
// Runtime: 6ms
// Memory Usage: 38.9 MB
// Link: https://leetcode.com/submissions/detail/423781563/
//-----------------------------------------------------------------------------

package bigegg.leetcode._0201_0250;

public class _0227_BasicCalculatorII {
    public int calculate(String s) {
        if (s == null || s.length() == 0) return 0;

        int length = s.length();
        int currentNumber = 0, lastNumber = 0, result = 0;
        char operation = '+';

        for (int i = 0; i < length; i++) {
            char currentChar = s.charAt(i);

            if (Character.isDigit(currentChar)) {
                currentNumber = (currentNumber * 10) + (currentChar - '0');
            }

            if (!Character.isDigit(currentChar) && !Character.isWhitespace(currentChar) || i == length - 1) {
                if (operation == '+' || operation == '-') {
                    result += lastNumber;
                    lastNumber = operation == '+' ? currentNumber : -currentNumber;
                } else if (operation == '*') {
                    lastNumber = lastNumber * currentNumber;
                } else if (operation == '/') {
                    lastNumber = lastNumber / currentNumber;
                }
                operation = currentChar;
                currentNumber = 0;
            }
        }
        result += lastNumber;
        return result;
    }
}
