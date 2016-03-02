package com.github.yoojia.inputs.impl;

import com.github.yoojia.inputs.EmptyableVerifier;

/**
 * 布尔值校验器
 * @author YOOJIA CHEN (yoojiachen@gmail.com)
 * @since 1.1
 */
public class BoolVerifier extends EmptyableVerifier {

    private final boolean mValue;

    public BoolVerifier(boolean mBool) {
        this.mValue = mBool;
    }

    @Override
    public boolean performTestNotEmpty(String notEmptyInput) throws Exception {
        return (mValue ? "true" : "false").equals(notEmptyInput.toLowerCase());
    }
}
