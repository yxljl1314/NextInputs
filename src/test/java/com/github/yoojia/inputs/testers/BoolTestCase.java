package com.github.yoojia.inputs.testers;

import com.github.yoojia.inputs.Tester;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author Yoojia Chen (yoojiachen@gmail.com)
 * @since 1.1
 */
public class BoolTestCase {

    @Test
    public void testTrue() throws Exception {
        Tester tester = new BoolTester(true);
        Assert.assertTrue(tester.performTest(null));
        Assert.assertTrue(tester.performTest(""));
        Assert.assertTrue(tester.performTest("true"));

        Assert.assertFalse(tester.performTest("trueHHH"));
    }

    @Test
    public void testFalse() throws Exception {
        Tester tester = new BoolTester(false);
        Assert.assertTrue(tester.performTest(null));
        Assert.assertTrue(tester.performTest(""));
        Assert.assertTrue(tester.performTest("false"));

        Assert.assertFalse(tester.performTest("falseXXX"));
    }
}
