package com.github.yoojia.inputs.impl;

import com.github.yoojia.inputs.AllowEmptyTester;

/**
 * Digits tester
 * @author 陈小锅 (yoojia.chen@gmail.com)
 */
public class DigitsTester extends AllowEmptyTester {

    @Override
    public boolean performTestNotEmpty(String input) throws Exception {
        return isDigits(input);
    }

    public static boolean isDigits(CharSequence input){
        final int length = input.length();
        for (int i = 0; i < length; i++) {
            if (!Character.isDigit(input.charAt(i))) {
                return false;
            }
        }
        return true;
    }

}
