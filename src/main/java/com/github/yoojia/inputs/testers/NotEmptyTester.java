package com.github.yoojia.inputs.testers;

import com.github.yoojia.inputs.Tester;

import static com.github.yoojia.inputs.Texts.isEmpty;

/**
 * 非空校验器
 * @author YOOJIA CHEN (yoojiachen@gmail.com)
 * @since 1.1
 */
public class NotEmptyTester implements Tester {
    @Override
    public boolean performTest(String rawInput) throws Exception {
        return !isEmpty(rawInput);
    }
}
