package com.github.yoojia.inputs.testers;

import com.github.yoojia.inputs.AllowEmptyTester;

/**
 * @author YOOJIA CHEN (yoojiachen@gmail.com)
 * @since 1.1
 */
public class BoolTester extends AllowEmptyTester{

    private final boolean mValue;

    public BoolTester(boolean mTFValue) {
        this.mValue = mTFValue;
    }

    @Override
    public boolean performTestNotEmpty(String notEmptyInput) throws Exception {
        return (mValue ? "true" : "false").equals(notEmptyInput.toLowerCase());
    }
}
