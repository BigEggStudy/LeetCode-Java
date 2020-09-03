package bigegg.leetcode._1051_1100;

import bigegg.leetcode.assertHelper;
import org.junit.Test;

import java.util.List;

public class _1096_BraceExpansionIITest {
    @Test
    public void BraceExpansionIITest_1()
    {
        _1096_BraceExpansionII solution = new _1096_BraceExpansionII();
        List<String> results = solution.braceExpansionII("{a,b}{c,{d,e}}");
        assertHelper.assertList(new String[] { "ac", "ad", "ae", "bc", "bd", "be" }, results);
    }

    @Test
    public void BraceExpansionIITest_2()
    {
        _1096_BraceExpansionII solution = new _1096_BraceExpansionII();
        List<String> results = solution.braceExpansionII("{{a,z},a{b,c},{ab,z}}");
        assertHelper.assertList(new String[] { "a", "ab", "ac", "z" }, results);
    }
}
