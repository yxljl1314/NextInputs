package com.github.yoojia.inputs.testers;

/**
 * Test rule Wrapper
 *
 * @author 陈小锅 (yoojia.chen@gmail.com)
 */
class Texts {

    public static boolean isEmpty(CharSequence value) {
        return value == null || value.length() == 0;
    }

    public static boolean regexMatch(String input, String regex) {
        return java.util.regex.Pattern.compile(regex).matcher(input).matches();
    }
}
