package com.github.yoojia.inputs.testers;

import com.github.yoojia.inputs.AllowEmptyTester;

import static com.github.yoojia.inputs.testers.Texts.regexMatch;

/**
 * @author YOOJIA CHEN (yoojiachen@gmail.com)
 * @since 1.1
 */
public class MobileTester extends AllowEmptyTester{
    @Override
    public boolean performTestNotEmpty(String notEmptyInput) throws Exception {
        return regexMatch(notEmptyInput, "^(\\+?\\d{2}-?)?(1[0-9])\\d{9}$");
    }
}
