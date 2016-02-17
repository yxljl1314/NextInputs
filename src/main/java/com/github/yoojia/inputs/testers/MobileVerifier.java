package com.github.yoojia.inputs.testers;

import com.github.yoojia.inputs.EmptyableVerifier;

import static com.github.yoojia.inputs.Texts.regexMatch;

/**
 * 中国11位手机号校验器
 * @author Yoojia Chen (yoojiachen@gmail.com)
 * @since 1.1
 */
public class MobileVerifier extends EmptyableVerifier {
    @Override
    public boolean performTestNotEmpty(String notEmptyInput) throws Exception {
        return regexMatch(notEmptyInput, "^(\\+?\\d{2}-?)?(1[0-9])\\d{9}$");
    }
}
