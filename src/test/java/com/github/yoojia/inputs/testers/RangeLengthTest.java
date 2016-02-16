package com.github.yoojia.inputs.testers;

import com.github.yoojia.inputs.Tester;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author Yoojia Chen (yoojiachen@gmail.com)
 * @since 1.1
 */
public class RangeLengthTest {

    @Test
    public void testPassed() throws Exception {
        Tester tester = new RangeLengthTester(3, 5);
        Assert.assertTrue(tester.performTest(null));
        Assert.assertTrue(tester.performTest(""));
        Assert.assertTrue(tester.performTest("123"));
        Assert.assertTrue(tester.performTest("1234"));
        Assert.assertTrue(tester.performTest("12345"));
    }

    @Test
    public void testFail() throws Exception {
        Tester tester = new RangeLengthTester(3,5);
        Assert.assertFalse(tester.performTest("1"));
        Assert.assertFalse(tester.performTest("12"));
        Assert.assertFalse(tester.performTest("123456"));
        Assert.assertFalse(tester.performTest("1234567"));
    }
}
