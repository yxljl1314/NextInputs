package com.github.yoojia.inputs;

/**
 *
 * @author 陈小锅 (yoojia.chen@gmail.com)
 */
public class Texts {

    /**
     * Is char sequence empty
     * @param value Value
     * @return is empty
     */
    public static boolean isEmpty(CharSequence value) {
        return value == null || value.length() == 0;
    }

    public static boolean regexMatch(String input, String regex) {
        return java.util.regex.Pattern.compile(regex).matcher(input).matches();
    }
}
