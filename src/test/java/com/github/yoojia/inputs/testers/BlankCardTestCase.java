package com.github.yoojia.inputs.testers;

import com.github.yoojia.inputs.Tester;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author Yoojia Chen (yoojiachen@gmail.com)
 * @since 1.1
 */
public class BlankCardTestCase {

    @Test
    public void testPassed() throws Exception {
        Tester tester = new BlankCardTester();
        Assert.assertTrue(tester.performTest(null));
        Assert.assertTrue(tester.performTest(""));
        Assert.assertTrue(tester.performTest("378282246310005"));
        Assert.assertTrue(tester.performTest("371449635398431"));
        Assert.assertTrue(tester.performTest("378734493671000"));
        Assert.assertTrue(tester.performTest("5610591081018250"));
        Assert.assertTrue(tester.performTest("30569309025904"));
        Assert.assertTrue(tester.performTest("38520000023237"));
        Assert.assertTrue(tester.performTest("6011111111111117"));
        Assert.assertTrue(tester.performTest("6011000990139424"));
        Assert.assertTrue(tester.performTest("3530111333300000"));
        Assert.assertTrue(tester.performTest("3566002020360505"));
        Assert.assertTrue(tester.performTest("5555555555554444"));
        Assert.assertTrue(tester.performTest("5105105105105100"));
        Assert.assertTrue(tester.performTest("4111111111111111"));
        Assert.assertTrue(tester.performTest("4012888888881881"));
        Assert.assertTrue(tester.performTest("4222222222222"));
        Assert.assertTrue(tester.performTest("5019717010103742"));
        Assert.assertTrue(tester.performTest("6331101999990016"));
        Assert.assertTrue(tester.performTest("869926735116986"));
        Assert.assertTrue(tester.performTest("4121551474702170"));
    }

    @Test
    public void testFail() throws Exception {
        Tester tester = new BlankCardTester();
        Assert.assertFalse(tester.performTest("abc"));
        Assert.assertFalse(tester.performTest("123456789012345"));
        Assert.assertFalse(tester.performTest("123456789012345678"));
        Assert.assertFalse(tester.performTest("411111111111111X"));
        Assert.assertFalse(tester.performTest("E111111111111111"));
    }
}
