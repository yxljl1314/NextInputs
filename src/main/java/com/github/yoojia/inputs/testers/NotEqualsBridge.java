package com.github.yoojia.inputs.testers;

import com.github.yoojia.inputs.LazyLoader;

/**
 * @author Yoojia Chen (yoojiachen@gmail.com)
 * @since 1.1
 */
public class NotEqualsBridge extends EqualsBridge {

    public NotEqualsBridge(LazyLoader<String> lazyLoader) {
        super(lazyLoader);
    }

    @Override
    public boolean performVerify(String input, String valueA, String valueB) {
        return ! input.equals(valueA);
    }
}
