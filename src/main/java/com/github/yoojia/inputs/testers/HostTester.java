package com.github.yoojia.inputs.testers;

import com.github.yoojia.inputs.AllowEmptyTester;

import static com.github.yoojia.inputs.testers.Texts.regexMatch;

/**
 * @author YOOJIA CHEN (yoojiachen@gmail.com)
 * @since 1.1
 */
public class HostTester extends AllowEmptyTester{

    @Override
    public boolean performTestNotEmpty(String notEmptyInput) throws Exception {
        return IPv4Tester.isIPv4(notEmptyInput) ||
                regexMatch(notEmptyInput.toLowerCase(), "^([a-z0-9]([a-z0-9\\-]{0,65}[a-z0-9])?\\.)+[a-z]{2,6}$") ;
    }

}
