package com.github.yoojia.inputs.testers;

import com.github.yoojia.inputs.Tester;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author Yoojia Chen (yoojiachen@gmail.com)
 * @since 1.1
 */
public class TestCase {

    @Test
    public void testPassed() throws Exception {
        Tester tester = new IPv4Tester();
        Assert.assertTrue(tester.performTest(null));
        Assert.assertTrue(tester.performTest(""));
    }

    @Test
    public void testFail() throws Exception {
        Tester tester = new IPv4Tester();
        Assert.assertFalse(tester.performTest(""));
    }
}
