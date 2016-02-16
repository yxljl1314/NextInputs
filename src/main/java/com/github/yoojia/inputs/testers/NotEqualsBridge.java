package com.github.yoojia.inputs.testers;

import com.github.yoojia.inputs.Loader;

/**
 * @author Yoojia Chen (yoojiachen@gmail.com)
 * @since 1.1
 */
public class NotEqualsBridge extends EqualsBridge {

    public NotEqualsBridge(Loader<String> loader) {
        super(loader);
    }

    @Override
    protected boolean performTest(String input, String valueA, String valueB) {
        return ! input.equals(valueA);
    }
}
