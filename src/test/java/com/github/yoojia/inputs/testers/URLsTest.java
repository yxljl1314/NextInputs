package com.github.yoojia.inputs.testers;

import com.github.yoojia.inputs.Tester;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author Yoojia Chen (yoojiachen@gmail.com)
 * @since 1.1
 */
public class URLsTest {

    @Test
    public void testPassed() throws Exception {
        Tester tester = new URLTester();
        Assert.assertTrue(tester.performTest(null));
        Assert.assertTrue(tester.performTest(""));
        Assert.assertTrue(tester.performTest("http://163.com"));
        Assert.assertTrue(tester.performTest("https://google.com"));
        Assert.assertTrue(tester.performTest("http://163.com/api"));
        Assert.assertTrue(tester.performTest("http://163.com/titles/"));
        Assert.assertTrue(tester.performTest("http://163.com/titles/?a=b"));
        Assert.assertTrue(tester.performTest("http://example.org/a-umlaut-%C3%A4"));
        Assert.assertTrue(tester.performTest("https://www.google.co.kr/url?sa=t&rct=j&q=&esrc=s"));
    }

    @Test
    public void testFail() throws Exception {
        Tester tester = new URLTester();
        Assert.assertFalse(tester.performTest("www.163.com"));
        Assert.assertFalse(tester.performTest("xxx://163.com"));
    }
}
