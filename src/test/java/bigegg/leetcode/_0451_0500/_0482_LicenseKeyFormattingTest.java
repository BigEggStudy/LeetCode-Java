package bigegg.leetcode._0451_0500;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _0482_LicenseKeyFormattingTest {
    @Test
    public void testLicenseKeyFormatting_1()
    {
        _0482_LicenseKeyFormatting solution = new _0482_LicenseKeyFormatting();
        String result = solution.licenseKeyFormatting("5F3Z-2e-9-w", 4);
        assertEquals("5F3Z-2E9W", result);
    }

    @Test
    public void testLicenseKeyFormatting_2()
    {
        _0482_LicenseKeyFormatting solution = new _0482_LicenseKeyFormatting();
        String result = solution.licenseKeyFormatting("2-5g-3-J", 2);
        assertEquals("2-5G-3J", result);
    }
}
