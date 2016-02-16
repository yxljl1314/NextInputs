package com.github.yoojia.inputs.testers;

import com.github.yoojia.inputs.AllowEmptyTester;

import static com.github.yoojia.inputs.testers.Texts.regexMatch;

/**
 * @author YOOJIA CHEN (yoojiachen@gmail.com)
 * @since 1.1
 */
public class IPv4Tester extends AllowEmptyTester{

    @Override
    public boolean performTestNotEmpty(String notEmptyInput) throws Exception {
        return isIPv4(notEmptyInput);
    }

    static boolean isIPv4(String notEmptyInput){
        return regexMatch(notEmptyInput,
                "(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)");
    }
}
