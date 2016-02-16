package com.github.yoojia.inputs.testers;

import com.github.yoojia.inputs.EmptyableTester;

/**
 * @author YOOJIA CHEN (yoojiachen@gmail.com)
 * @since 1.1
 */
public class MinLengthTester extends EmptyableTester {

    private final int mLength;

    public MinLengthTester(int mLength) {
        this.mLength = mLength;
    }

    @Override
    public boolean performTestNotEmpty(String notEmptyInput) throws Exception {
        return notEmptyInput.length() >= mLength;
    }
}
