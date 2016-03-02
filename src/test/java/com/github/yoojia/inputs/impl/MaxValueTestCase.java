package com.github.yoojia.inputs.impl;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Yoojia Chen (yoojiachen@gmail.com)
 * @since 1.1
 */
public class MaxValueTestCase {

    @Test
    public void testPassed() throws Exception {
        ValueBridge bridge = new MaxValueBridge(10);
        BridgeVerifier<Double> verifier = new BridgeVerifier<>(bridge);
        Assert.assertTrue(verifier.perform(null));
        Assert.assertTrue(verifier.perform(""));
        Assert.assertTrue(verifier.perform("9"));
        Assert.assertTrue(verifier.perform("0"));
        Assert.assertTrue(verifier.perform("-99"));
    }

    @Test
    public void testFail() throws Exception {
        ValueBridge bridge = new MaxValueBridge(10);
        BridgeVerifier<Double> verifier = new BridgeVerifier<>(bridge);
        Assert.assertFalse(verifier.perform("11"));
        Assert.assertFalse(verifier.perform("999"));
    }
}
