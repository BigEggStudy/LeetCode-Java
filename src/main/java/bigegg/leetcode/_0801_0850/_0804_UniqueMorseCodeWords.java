//-----------------------------------------------------------------------------
// Runtime: 1ms
// Memory Usage: 36.8 MB
// Link: https://leetcode.com/submissions/detail/423179933/
//-----------------------------------------------------------------------------

package bigegg.leetcode._0801_0850;

import java.util.*;

public class _0804_UniqueMorseCodeWords {
    public int uniqueMorseRepresentations(String[] words) {
        String[] MORSE = new String[]{".-","-...","-.-.","-..",".","..-.","--.",
                "....","..",".---","-.-",".-..","--","-.",
                "---",".--.","--.-",".-.","...","-","..-",
                "...-",".--","-..-","-.--","--.."};

        Set<String> seen = new HashSet<>();
        for (String word: words) {
            StringBuilder code = new StringBuilder();
            for (char c: word.toCharArray())
                code.append(MORSE[c - 'a']);
            seen.add(code.toString());
        }

        return seen.size();
    }
}
