package com.github.yoojia.inputs.testers;

import com.github.yoojia.inputs.Tester;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author Yoojia Chen (yoojiachen@gmail.com)
 * @since 1.1
 */
public class NumericTestCase {

    @Test
    public void testPassed() throws Exception {
        Tester tester = new NumericTester();
        Assert.assertTrue(tester.performTest(null));
        Assert.assertTrue(tester.performTest(""));
        Assert.assertTrue(tester.performTest("1"));
        Assert.assertTrue(tester.performTest("-123"));
        Assert.assertTrue(tester.performTest("+123"));
        Assert.assertTrue(tester.performTest("12345678L"));
        Assert.assertTrue(tester.performTest("12345678l"));
        Assert.assertTrue(tester.performTest("1.0"));
        Assert.assertTrue(tester.performTest("1.23f"));
        Assert.assertTrue(tester.performTest("1.23456d"));
        Assert.assertTrue(tester.performTest("1.00000"));
        Assert.assertTrue(tester.performTest("1.00000123"));
        Assert.assertTrue(tester.performTest("12345.0"));
        Assert.assertTrue(tester.performTest("-12345.0"));
        Assert.assertTrue(tester.performTest("-12345.0"));
        Assert.assertTrue(tester.performTest("0x01"));
        Assert.assertTrue(tester.performTest("0xFF"));
        Assert.assertTrue(tester.performTest("0xee"));
        Assert.assertTrue(tester.performTest("12e34"));
        Assert.assertTrue(tester.performTest("12E-34"));
    }

    @Test
    public void testFail() throws Exception {
        Tester tester = new NumericTester();
        Assert.assertFalse(tester.performTest("a"));
        Assert.assertFalse(tester.performTest("1.0.0"));
        Assert.assertFalse(tester.performTest("1.000123K"));
        Assert.assertFalse(tester.performTest("1K"));
        Assert.assertFalse(tester.performTest("1M"));
        Assert.assertFalse(tester.performTest("0xGG"));
        Assert.assertFalse(tester.performTest("12EE34"));
        Assert.assertFalse(tester.performTest("12E.34"));
    }
}
