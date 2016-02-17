package com.github.yoojia.inputs.testers;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Yoojia Chen (yoojiachen@gmail.com)
 * @since 1.1
 */
public class RangeValueTestCase {

    @Test
    public void testPassed() throws Exception {
        ValueBridge bridge = new RangeValueBridge(5, 10);
        BridgeVerifier<Double> verifier = new BridgeVerifier<>(bridge);
        Assert.assertTrue(verifier.perform(null));
        Assert.assertTrue(verifier.perform(""));
        Assert.assertTrue(verifier.perform("5"));
        Assert.assertTrue(verifier.perform("8"));
        Assert.assertTrue(verifier.perform("10"));
    }

    @Test
    public void testFail() throws Exception {
        ValueBridge bridge = new RangeValueBridge(5, 10);
        BridgeVerifier<Double> verifier = new BridgeVerifier<>(bridge);
        Assert.assertFalse(verifier.perform("-10"));
        Assert.assertFalse(verifier.perform("4"));
        Assert.assertFalse(verifier.perform("11"));
        Assert.assertFalse(verifier.perform("999"));
    }
}
