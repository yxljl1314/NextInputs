package com.github.yoojia.inputs.impl;

import com.github.yoojia.inputs.EmptyableVerifier;

/**
 * @author YOOJIA CHEN (yoojiachen@gmail.com)
 * @since 1.1
 */
public class MinLengthVerifier extends EmptyableVerifier {

    private final int mLength;

    public MinLengthVerifier(int mLength) {
        this.mLength = mLength;
    }

    @Override
    public boolean performTestNotEmpty(String notEmptyInput) throws Exception {
        return notEmptyInput.length() >= mLength;
    }
}
