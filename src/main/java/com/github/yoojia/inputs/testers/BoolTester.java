package com.github.yoojia.inputs.testers;

import com.github.yoojia.inputs.EmptyableTester;

/**
 * 布尔值校验器
 * @author YOOJIA CHEN (yoojiachen@gmail.com)
 * @since 1.1
 */
public class BoolTester extends EmptyableTester {

    private final boolean mValue;

    public BoolTester(boolean mBool) {
        this.mValue = mBool;
    }

    @Override
    public boolean performTestNotEmpty(String notEmptyInput) throws Exception {
        return (mValue ? "true" : "false").equals(notEmptyInput.toLowerCase());
    }
}
