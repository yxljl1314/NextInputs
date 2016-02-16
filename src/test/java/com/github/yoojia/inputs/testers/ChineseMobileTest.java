package com.github.yoojia.inputs.testers;

import com.github.yoojia.inputs.Tester;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author Yoojia Chen (yoojiachen@gmail.com)
 * @since 1.1
 */
public class ChineseMobileTest {

    @Test
    public void testPassed() throws Exception {
        Tester tester = new MobileTester();
        Assert.assertTrue(tester.performTest(null));
        Assert.assertTrue(tester.performTest(""));
        Assert.assertTrue(tester.performTest("13800138000"));
        Assert.assertTrue(tester.performTest("13570859999"));
        Assert.assertTrue(tester.performTest("13112111001"));
    }

    @Test
    public void testFail() throws Exception {
        Tester tester = new MobileTester();
        Assert.assertFalse(tester.performTest("12306"));
        Assert.assertFalse(tester.performTest("mobile"));
        Assert.assertFalse(tester.performTest("88888888"));
        Assert.assertFalse(tester.performTest("123456789012"));
        Assert.assertFalse(tester.performTest("1234567890X"));
    }
}
