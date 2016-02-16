package com.github.yoojia.inputs.testers;

import com.github.yoojia.inputs.ABBridge;
import com.github.yoojia.inputs.Loader;

/**
 * @author Yoojia Chen (yoojiachen@gmail.com)
 * @since 1.1
 */
public class EqualsBridge extends ABBridge<String>{

    private final Loader<String> mStringLoader;

    public EqualsBridge(Loader<String> loader) {
        this.mStringLoader = loader;
    }

    @Override
    protected String getValueA() {
        return mStringLoader.getValue();
    }

    @Override
    protected String getValueB() {
        return mStringLoader.getValue();
    }

    @Override
    protected String stringToTyped(String input) {
        return input;
    }

    @Override
    protected boolean performTest(String input, String valueA, String valueB) {
        return input.equals(valueA);
    }
}
