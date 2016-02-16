package com.github.yoojia.inputs.testers;

import com.github.yoojia.inputs.Tester;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author Yoojia Chen (yoojiachen@gmail.com)
 * @since 1.1
 */
public class NotBlankTest {

    @Test
    public void testPassed() throws Exception {
        Tester tester = new NotBlankTester();
        Assert.assertTrue(tester.performTest("1"));
        Assert.assertTrue(tester.performTest("abc"));
    }

    @Test
    public void testFail() throws Exception {
        Tester tester = new NotBlankTester();
        Assert.assertFalse(tester.performTest(null));
        Assert.assertFalse(tester.performTest(""));
        Assert.assertFalse(tester.performTest("  "));
        Assert.assertFalse(tester.performTest(" "));
        Assert.assertFalse(tester.performTest("    "));
    }
}
