package com.github.yoojia.inputs.impl;

import com.github.yoojia.inputs.LazyLoader;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author Yoojia Chen (yoojiachen@gmail.com)
 * @since 1.1
 */
public class EqualsTestCase {

    @Test
    public void testPassed() throws Exception {
        EqualsBridge bridge = new EqualsBridge(new LazyLoader<String>() {
            @Override
            public String getValue() {
                return "NextInputs";
            }
        });
        BridgeVerifier<String> verifier = new BridgeVerifier<>(bridge);
        Assert.assertTrue(verifier.perform("NextInputs"));
    }

    @Test
    public void testFail() throws Exception {
        EqualsBridge bridge = new EqualsBridge(new LazyLoader<String>() {
            @Override
            public String getValue() {
                return "NextInputs";
            }
        });
        BridgeVerifier<String> verifier = new BridgeVerifier<>(bridge);
        Assert.assertFalse(verifier.perform("NextInputs-Java"));
    }
}
