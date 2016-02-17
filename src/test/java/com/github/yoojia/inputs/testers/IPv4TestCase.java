package com.github.yoojia.inputs.testers;

import com.github.yoojia.inputs.Tester;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author Yoojia Chen (yoojiachen@gmail.com)
 * @since 1.1
 */
public class IPv4TestCase {

    @Test
    public void testPassed() throws Exception {
        Tester tester = new IPv4Tester();
        Assert.assertTrue(tester.performTest(null));
        Assert.assertTrue(tester.performTest(""));
        Assert.assertTrue(tester.performTest("0.0.0.0"));
        Assert.assertTrue(tester.performTest("1.1.1.1"));
        Assert.assertTrue(tester.performTest("192.168.1.100"));
        Assert.assertTrue(tester.performTest("10.0.0.0"));
        Assert.assertTrue(tester.performTest("255.255.255.255"));
    }

    @Test
    public void testFail() throws Exception {
        Tester tester = new IPv4Tester();
        Assert.assertFalse(tester.performTest("1"));
        Assert.assertFalse(tester.performTest("1.2.3.4.5"));
        Assert.assertFalse(tester.performTest("300.2.3.4"));
        Assert.assertFalse(tester.performTest("256.2.3.4"));
        Assert.assertFalse(tester.performTest("255.255.255.256"));
        Assert.assertFalse(tester.performTest("255.255.255.abc"));
        Assert.assertFalse(tester.performTest("255.255.256"));
        Assert.assertFalse(tester.performTest("255.255..256"));
        Assert.assertFalse(tester.performTest("0-123-234-1"));
    }
}
