package com.github.yoojia.inputs.testers;

import com.github.yoojia.inputs.AbstractTester;

import static com.github.yoojia.inputs.testers.Texts.isEmpty;


/**
 * @author YOOJIA CHEN (yoojiachen@gmail.com)
 * @since 1.1
 */
public class NotEmptyTester implements AbstractTester {
    @Override
    public boolean performTest(String rawInput) throws Exception {
        return !isEmpty(rawInput);
    }
}
