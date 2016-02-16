package com.github.yoojia.inputs.testers;

import com.github.yoojia.inputs.AllowEmptyTester;

import static com.github.yoojia.inputs.testers.Texts.regexMatch;

/**
 * @author YOOJIA CHEN (yoojiachen@gmail.com)
 * @since 1.1
 */
public class URLTester extends AllowEmptyTester{
    @Override
    public boolean performTestNotEmpty(String notEmptyInput) throws Exception {
        return regexMatch(notEmptyInput.toLowerCase(),
                "^(https?:\\/\\/)?[\\w\\-_]+(\\.[\\w\\-_]+)+([\\w\\-\\.,@?^=%&amp;:/~\\+#]*[\\w\\-\\@?^=%&amp;/~\\+#])?$");
    }
}
