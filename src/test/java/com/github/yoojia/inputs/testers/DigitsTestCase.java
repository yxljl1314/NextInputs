package com.github.yoojia.inputs.testers;

import com.github.yoojia.inputs.Tester;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author Yoojia Chen (yoojiachen@gmail.com)
 * @since 1.1
 */
public class DigitsTestCase {

    @Test
    public void testPassed() throws Exception {
        Tester tester = new DigitsTester();
        Assert.assertTrue(tester.performTest(null));
        Assert.assertTrue(tester.performTest(""));
        Assert.assertTrue(tester.performTest("1"));
        Assert.assertTrue(tester.performTest("123"));
        Assert.assertTrue(tester.performTest("99999999999"));
    }

    @Test
    public void testFail() throws Exception {
        Tester tester = new DigitsTester();
        Assert.assertFalse(tester.performTest("1a"));
        Assert.assertFalse(tester.performTest("123l"));
        Assert.assertFalse(tester.performTest("123456L"));
        Assert.assertFalse(tester.performTest("0x123"));
        Assert.assertFalse(tester.performTest("0xFF"));
        Assert.assertFalse(tester.performTest("0x00"));
        Assert.assertFalse(tester.performTest("abc"));
    }
}
