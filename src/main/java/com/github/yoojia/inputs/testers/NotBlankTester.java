package com.github.yoojia.inputs.testers;

import com.github.yoojia.inputs.Tester;

import static com.github.yoojia.inputs.Texts.isEmpty;
import static com.github.yoojia.inputs.Texts.regexMatch;

/**
 * 非空值(包含制表符等)校验器
 * @author YOOJIA CHEN (yoojiachen@gmail.com)
 * @since 1.1
 */
public class NotBlankTester implements Tester {
    @Override
    public boolean performTest(String rawInput) throws Exception {
        if (isEmpty(rawInput)) {
            return false;
        }
        return !regexMatch(rawInput, "^\\s*$");
    }
}
