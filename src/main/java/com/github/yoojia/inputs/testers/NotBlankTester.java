package com.github.yoojia.inputs.testers;

import com.github.yoojia.inputs.AbstractTester;

import static com.github.yoojia.inputs.testers.Texts.isEmpty;
import static com.github.yoojia.inputs.testers.Texts.regexMatch;


/**
 * @author YOOJIA CHEN (yoojiachen@gmail.com)
 * @since 1.1
 */
public class NotBlankTester implements AbstractTester {
    @Override
    public boolean performTest(String rawInput) throws Exception {
        if (isEmpty(rawInput)) {
            return false;
        }
        return regexMatch(rawInput, "^\\s*$");
    }
}
