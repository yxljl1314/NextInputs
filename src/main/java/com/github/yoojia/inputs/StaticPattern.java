package com.github.yoojia.inputs;

import com.github.yoojia.inputs.impl.BlankCardTester;
import com.github.yoojia.inputs.impl.ChineseIDCardTester;
import com.github.yoojia.inputs.impl.DigitsTester;
import com.github.yoojia.inputs.impl.NumericTester;

import static com.github.yoojia.inputs.Texts.isEmpty;

/**
 * @author 陈小锅 (yoojia.chen@gmail.com)
 */
public class StaticPattern {

    public static final int PRIORITY_REQUIRED = -1024;
    public static final int PRIORITY_GENERAL = 0;

    /**
     * 必要项，输入内容不能为空
     * @return Pattern
     */
    public static Pattern Required(){
        return new Pattern(new AbstractTester() {
            @Override
            public boolean performTest(String rawInput) throws Exception {
                return !isEmpty(rawInput);
            }
        })
        .priority(PRIORITY_REQUIRED)
        .msgOnFail("此为必填条目");
    }

    /**
     * 输入内容不能为空值：空格，制表符等
     * @return Pattern
     */
    public static Pattern NotBlank(){
        return new Pattern(new AbstractTester() {
            @Override
            public boolean performTest(String rawInput) throws Exception {
                if (isEmpty(rawInput)) {
                    return false;
                }
                return regexMatch(rawInput, "^\\s*$");
            }
        })
        .priority(PRIORITY_GENERAL)
        .msgOnFail("请输入非空内容");
    }

    /**
     * 输入内容只能是数字
     * @return Pattern
     */
    public static Pattern Digits(){
        return new Pattern(new DigitsTester())
        .priority(PRIORITY_GENERAL)
        .msgOnFail("请输入数字");
    }

    /**
     * 电子邮件地址
     * @return Pattern
     */
    public static Pattern Email(){
        return new Pattern(new AllowEmptyTester() {
            @Override
            public boolean performTestNotEmpty(String input) throws Exception {
                return regexMatch(input.toLowerCase(), "^[a-z0-9!#$%&'*+/=?^_`{|}~-]+" +
                        "(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+" +
                        "[a-z0-9](?:[a-z0-9-]*[a-z0-9])?$");
            }
        })
        .priority(PRIORITY_GENERAL)
        .msgOnFail("请输入有效的邮件地址");
    }

    private static boolean isIPv4(String notEmptyInput){
        return regexMatch(notEmptyInput,
                "(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)");
    }

    /**
     * IPV4地址
     * @return Pattern
     */
    public static Pattern IPv4(){
        return new Pattern(new AllowEmptyTester() {
            @Override
            public boolean performTestNotEmpty(String notEmptyInput) throws Exception {
                return isIPv4(notEmptyInput);
            }
        })
        .priority(PRIORITY_GENERAL)
        .msgOnFail("请输入有效的IP地址");
    }


    /**
     * 域名地址
     * @return Pattern
     */
    public static Pattern Host(){
        return new Pattern(new AllowEmptyTester() {
            @Override
            public boolean performTestNotEmpty(String notEmptyInput) throws Exception {
                return isIPv4(notEmptyInput) ||
                        regexMatch(notEmptyInput.toLowerCase(), "^([a-z0-9]([a-z0-9\\-]{0,65}[a-z0-9])?\\.)+[a-z]{2,6}$");
            }
        })
        .priority(PRIORITY_GENERAL)
        .msgOnFail("请输入有效的域名地址");
    }

    /**
     * URL地址
     * @return Pattern
     */
    public static Pattern URL(){
        return new Pattern(new AllowEmptyTester() {
            @Override
            public boolean performTestNotEmpty(String notEmptyInput) throws Exception {
                return regexMatch(notEmptyInput.toLowerCase(),
                        "^(https?:\\/\\/)?[\\w\\-_]+(\\.[\\w\\-_]+)+([\\w\\-\\.,@?^=%&amp;:/~\\+#]*[\\w\\-\\@?^=%&amp;/~\\+#])?$");
            }
        })
        .priority(PRIORITY_GENERAL)
        .msgOnFail("请输入有效的网址");
    }

    /**
     * 数值
     * @return Pattern
     */
    public static Pattern Numeric(){
        return new Pattern(new NumericTester())
                .priority(PRIORITY_GENERAL)
                .msgOnFail("请输入有效的数值");
    }

    /**
     * 银行卡号
     * @return Pattern
     */
    public static Pattern BlankCard(){
        return new Pattern(new BlankCardTester())
                .priority(PRIORITY_GENERAL)
                .msgOnFail("请输入有效的银行卡/信用卡号码");
    }

    /**
     * 身份证号
     * @return Pattern
     */
    public static Pattern ChineseIDCard(){
        return new Pattern(new ChineseIDCardTester())
                .priority(PRIORITY_GENERAL)
                .msgOnFail("请输入有效的身份证号");
    }

    /**
     * 手机号
     * @return Pattern
     */
    public static Pattern ChineseMobile(){
        return new Pattern(new AllowEmptyTester() {
            @Override
            public boolean performTestNotEmpty(String notEmptyInput) throws Exception {
                return regexMatch(notEmptyInput, "^(\\+?\\d{2}-?)?(1[0-9])\\d{9}$");
            }
        })
        .priority(PRIORITY_GENERAL)
        .msgOnFail("请输入有效的手机号");
    }

    /**
     * 为True状态
     * @return Pattern
     */
    public static Pattern IsTrue(){
        return new Pattern(new AllowEmptyTester() {
            @Override
            public boolean performTestNotEmpty(String input) throws Exception {
                return "true".equals(input.toLowerCase());
            }
        })
        .priority(PRIORITY_GENERAL)
        .msgOnFail("当前项必须为True");
    }

    /**
     * 为False状态
     * @return Pattern
     */
    public static Pattern IsFalse(){
        return new Pattern(new AllowEmptyTester() {
            @Override
            public boolean performTestNotEmpty(String input) throws Exception {
                return "false".equals(input.toLowerCase());
            }
        })
        .priority(PRIORITY_GENERAL)
        .msgOnFail("当前项必须为False");
    }

    public static Pattern RegexMatch(final String regex) {
        return new Pattern(new AbstractTester() {
            @Override
            public boolean performTest(String rawInput) throws Exception {
                return regexMatch(rawInput, regex);
            }
        }).priority(PRIORITY_GENERAL);
    }

    private static boolean regexMatch(String input, String regex) {
        return java.util.regex.Pattern.compile(regex).matcher(input).matches();
    }
    

}
