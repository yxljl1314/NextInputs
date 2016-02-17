package com.github.yoojia.inputs.testers;

import com.github.yoojia.inputs.Tester;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author Yoojia Chen (yoojiachen@gmail.com)
 * @since 1.1
 */
public class HostTestCase {

    @Test
    public void testPassed() throws Exception {
        Tester tester = new HostTester();
        Assert.assertTrue(tester.performTest(null));
        Assert.assertTrue(tester.performTest(""));
        Assert.assertTrue(tester.performTest("1.2.3.4"));
        Assert.assertTrue(tester.performTest("abc.com"));
        Assert.assertTrue(tester.performTest("api.abc.com"));
    }

    @Test
    public void testFail() throws Exception {
        Tester tester = new HostTester();
        Assert.assertFalse(tester.performTest("abc"));
        Assert.assertFalse(tester.performTest("abc..com"));
        Assert.assertFalse(tester.performTest("1.2.3.4.5"));
        Assert.assertFalse(tester.performTest("http://abc.com"));
        Assert.assertFalse(tester.performTest("http://1.2.3.4"));
    }
}
