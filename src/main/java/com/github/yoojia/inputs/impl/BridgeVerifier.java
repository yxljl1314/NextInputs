package com.github.yoojia.inputs.impl;

import com.github.yoojia.inputs.ABBridge;
import com.github.yoojia.inputs.EmptyableVerifier;

/**
 * @author Yoojia Chen (yoojiachen@gmail.com)
 * @since 1.1
 */
public class BridgeVerifier<T> extends EmptyableVerifier {

    private final ABBridge<T> mBridge;

    public BridgeVerifier(ABBridge<T> bridge) {
        mBridge = bridge;
    }

    @Override
    public boolean performTestNotEmpty(String notEmptyInput) throws Exception {
        final T value = mBridge.stringToTyped(notEmptyInput);
        return mBridge.performVerify(value, mBridge.getValueA(), mBridge.getValueB());
    }
}
