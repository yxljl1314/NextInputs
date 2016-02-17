package com.github.yoojia.inputs.testers;

import com.github.yoojia.inputs.EmptyableVerifier;

/**
 * @author YOOJIA CHEN (yoojiachen@gmail.com)
 * @since 1.1
 */
public class RangeLengthVerifier extends EmptyableVerifier {

    private final int mMinLength;
    private final int mMaxLength;

    public RangeLengthVerifier(int min, int max) {
        this.mMinLength = min;
        this.mMaxLength = max;
    }

    @Override
    public boolean performTestNotEmpty(String notEmptyInput) throws Exception {
        final int length = notEmptyInput.length();
        return mMinLength <= length && length <= mMaxLength;
    }
}
