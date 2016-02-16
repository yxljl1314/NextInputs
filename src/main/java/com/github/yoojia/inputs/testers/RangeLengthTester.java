package com.github.yoojia.inputs.testers;

import com.github.yoojia.inputs.EmptyableTester;

/**
 * @author YOOJIA CHEN (yoojiachen@gmail.com)
 * @since 1.1
 */
public class RangeLengthTester extends EmptyableTester {

    private final int mMinLength;
    private final int mMaxLength;

    public RangeLengthTester(int min, int max) {
        this.mMinLength = min;
        this.mMaxLength = max;
    }

    @Override
    public boolean performTestNotEmpty(String notEmptyInput) throws Exception {
        final int length = notEmptyInput.length();
        return mMinLength <= length && length <= mMaxLength;
    }
}
