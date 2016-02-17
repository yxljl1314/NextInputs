package com.github.yoojia.inputs.testers;

import com.github.yoojia.inputs.ABBridge;
import com.github.yoojia.inputs.LazyLoader;

/**
 * @author Yoojia Chen (yoojiachen@gmail.com)
 * @since 1.1
 */
public class EqualsBridge extends ABBridge<String>{

    private final LazyLoader<String> mStringLazyLoader;

    public EqualsBridge(LazyLoader<String> lazyLoader) {
        this.mStringLazyLoader = lazyLoader;
    }

    @Override
    public String getValueA() {
        return mStringLazyLoader.getValue();
    }

    @Override
    public String getValueB() {
        return mStringLazyLoader.getValue();
    }

    @Override
    public String stringToTyped(String input) {
        return input;
    }

    @Override
    public boolean performVerify(String input, String valueA, String valueB) {
        return input.equals(valueA);
    }
}
