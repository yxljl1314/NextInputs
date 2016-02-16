package com.github.yoojia.inputs.testers;

import com.github.yoojia.inputs.EmptyableTester;

import static com.github.yoojia.inputs.Texts.regexMatch;

/**
 * URL地址校验器
 * @author YOOJIA CHEN (yoojiachen@gmail.com)
 * @since 1.1
 */
public class URLTester extends EmptyableTester {
    @Override
    public boolean performTestNotEmpty(String notEmptyInput) throws Exception {
        return regexMatch(notEmptyInput.toLowerCase(),
                "^(https?:\\/\\/)?[\\w\\-_]+(\\.[\\w\\-_]+)+([\\w\\-\\.,@?^=%&amp;:/~\\+#]*[\\w\\-\\@?^=%&amp;/~\\+#])?$");
    }
}
