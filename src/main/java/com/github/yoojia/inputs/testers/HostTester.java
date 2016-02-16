package com.github.yoojia.inputs.testers;

import com.github.yoojia.inputs.EmptyableTester;

import static com.github.yoojia.inputs.Texts.regexMatch;

/**
 * 主机地址校验器
 * @author YOOJIA CHEN (yoojiachen@gmail.com)
 * @since 1.1
 */
public class HostTester extends EmptyableTester {

    @Override
    public boolean performTestNotEmpty(String notEmptyInput) throws Exception {
        return IPv4Tester.isIPv4(notEmptyInput) ||
                regexMatch(notEmptyInput.toLowerCase(), "^([a-z0-9]([a-z0-9\\-]{0,65}[a-z0-9])?\\.)+[a-z]{2,6}$") ;
    }

}
