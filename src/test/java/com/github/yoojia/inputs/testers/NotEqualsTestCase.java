package com.github.yoojia.inputs.testers;

import com.github.yoojia.inputs.LazyLoader;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author Yoojia Chen (yoojiachen@gmail.com)
 * @since 1.1
 */
public class NotEqualsTestCase {

    @Test
    public void testPassed() throws Exception {
        NotEqualsBridge bridge = new NotEqualsBridge(new LazyLoader<String>() {
            @Override
            public String getValue() {
                return "NextInputs";
            }
        });
        BridgeVerifier<String> verifier = new BridgeVerifier<>(bridge);
        Assert.assertTrue(verifier.perform("NextInputs-NE"));
    }

    @Test
    public void testFail() throws Exception {
        NotEqualsBridge bridge = new NotEqualsBridge(new LazyLoader<String>() {
            @Override
            public String getValue() {
                return "NextInputs";
            }
        });
        BridgeVerifier<String> verifier = new BridgeVerifier<>(bridge);
        Assert.assertFalse(verifier.perform("NextInputs"));
    }
}
