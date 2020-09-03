//-----------------------------------------------------------------------------
// Runtime: 44ms
// Memory Usage: 
// Link: 
//-----------------------------------------------------------------------------

package bigegg.leetcode._1051_1100;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

public class _1096_BraceExpansionII {
    public List<String> braceExpansionII(String expression) {
        Stack<List<String>> stack = new Stack<>();
        List<String> union = new ArrayList<>();
        List<String> product = new ArrayList<>();
        product.add("");

        for (char ch : expression.toCharArray()) {
            if (ch == '{') {
                stack.push(union);
                stack.push(product);
                union = new ArrayList<>();
                product = new ArrayList<>();
                product.add("");
            } else if (ch == '}') {
                List<String> pre_product = stack.pop();
                List<String> pre_union = stack.pop();
                union.addAll(product);
                product = new ArrayList<>();
                for (String str1 : pre_product)
                    for (String str2 : union)
                        product.add(str1 + str2);
                union = pre_union;
            } else if (ch == ',') {
                union.addAll(product);
                product = new ArrayList<>();
                product.add("");
            } else {
                for (int i = 0; i < product.size(); i++)
                    product.set(i, product.get(i) + ch);
            }
        }

        union.addAll(product);
        return union.stream().distinct().sorted().collect(Collectors.toList());
    }
}
