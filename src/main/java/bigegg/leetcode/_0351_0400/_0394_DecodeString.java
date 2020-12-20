//-----------------------------------------------------------------------------
// Runtime: 0ms
// Memory Usage: 37 mb
// Link: https://leetcode.com/submissions/detail/422164064/
//-----------------------------------------------------------------------------

package bigegg.leetcode._0351_0400;

import java.util.Stack;

public class _0394_DecodeString {
    public String decodeString(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<StringBuilder> stringStack = new Stack<>();
        StringBuilder currentString = new StringBuilder();

        int num = 0;
        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                num = num * 10 + ch - '0';
            } else if (ch == '[') {
                countStack.push(num);
                stringStack.push(currentString);
                currentString = new StringBuilder();
                num = 0;
            } else if (ch == ']') {
                StringBuilder decodedString = stringStack.pop();
                for (int count = countStack.pop(); count > 0; count--) {
                    decodedString.append(currentString);
                }
                currentString = decodedString;
            } else {
                currentString.append(ch);
            }
        }
        return currentString.toString();
    }
}
