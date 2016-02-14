package com.github.yoojia.inputs;

import static com.github.yoojia.inputs.Texts.isEmpty;

/**
 * Allow empty input Tester
 * @author 陈小锅 (yoojia.chen@gmail.com)
 */
public abstract class AllowEmptyTester implements AbstractTester {

    @Override
    public final boolean performTest(String rawInput) throws Exception {
        if (isEmpty(rawInput)) {
            return true;
        }
        return performTestNotEmpty(rawInput);
    }

    public abstract boolean performTestNotEmpty(String notEmptyInput) throws Exception;

}
