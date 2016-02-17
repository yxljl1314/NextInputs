package com.github.yoojia.inputs.testers;

import com.github.yoojia.inputs.Tester;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author Yoojia Chen (yoojiachen@gmail.com)
 * @since 1.1
 * http://blogs.msdn.com/b/testing123/archive/2009/02/05/email-address-test-cases.aspx
 */
public class EmailTestCase {

    @Test
    public void testPassed() throws Exception {
        Tester tester = new EmailTester();
        Assert.assertTrue(tester.performTest(null));
        Assert.assertTrue(tester.performTest(""));
        Assert.assertTrue(tester.performTest("email@domain.com"));
        Assert.assertTrue(tester.performTest("firstname.lastname@domain.com"));
        Assert.assertTrue(tester.performTest("email@subdomain.domain.com"));
        Assert.assertTrue(tester.performTest("firstname+lastname@domain.com"));
        Assert.assertTrue(tester.performTest("email@123.123.123.123"));
        Assert.assertTrue(tester.performTest("1234567890@domain.com"));
        Assert.assertTrue(tester.performTest("email@domain-one.com"));
        Assert.assertTrue(tester.performTest("_______@domain.com"));
        Assert.assertTrue(tester.performTest("email@domain.name"));
        Assert.assertTrue(tester.performTest("email@domain.co.jp"));
        Assert.assertTrue(tester.performTest("firstname-lastname@domain.com"));
    }

    @Test
    public void testFail() throws Exception {
        Tester tester = new EmailTester();
        Assert.assertFalse(tester.performTest("plainaddress"));
        Assert.assertFalse(tester.performTest("#@%^%#$@#$@#.com"));
        Assert.assertFalse(tester.performTest("@domain.com"));
        Assert.assertFalse(tester.performTest("Joe Smith <email@domain.com>"));
        Assert.assertFalse(tester.performTest("email.domain.com"));
        Assert.assertFalse(tester.performTest("email@domain@domain.com"));
        Assert.assertFalse(tester.performTest(".email@domain.com"));
        Assert.assertFalse(tester.performTest("email.@domain.com"));
        Assert.assertFalse(tester.performTest("email..email@domain.com"));
        Assert.assertFalse(tester.performTest("あいうえお@domain.com"));
        Assert.assertFalse(tester.performTest("email@domain.com (Joe Smith)"));
        Assert.assertFalse(tester.performTest("email@domain"));
        Assert.assertFalse(tester.performTest("email@-domain.com"));
        Assert.assertFalse(tester.performTest("email@domain..com"));
    }
}
