package com.github.yoojia.inputs;

import com.github.yoojia.inputs.testers.*;

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
        return new Pattern(new NotEmptyVerifier()).msg("此为必填项目").priority(PRIORITY_REQUIRED);
    }

    /**
     * 输入内容不能为空值：空格，制表符等
     * @return Pattern
     */
    public static Pattern NotBlank(){
        return new Pattern(new NotBlankVerifier()).msg("请输入非空内容");
    }

    /**
     * 输入内容只能是数字
     * @return Pattern
     */
    public static Pattern Digits(){
        return new Pattern(new DigitsVerifier()).msg("请输入数字");
    }

    /**
     * 电子邮件地址
     * @return Pattern
     */
    public static Pattern Email(){
        return new Pattern(new EmailVerifier()).msg("请输入有效的邮件地址");
    }

    /**
     * IPV4地址
     * @return Pattern
     */
    public static Pattern IPv4(){
        return new Pattern(new IPv4Verifier()).msg("请输入有效的IP地址");
    }

    /**
     * 域名地址
     * @return Pattern
     */
    public static Pattern Host(){
        return new Pattern(new HostVerifier()).msg("请输入有效的域名地址");
    }

    /**
     * URL地址
     * @return Pattern
     */
    public static Pattern URL(){
        return new Pattern(new URLVerifier()).msg("请输入有效的网址");
    }

    /**
     * 数值
     * @return Pattern
     */
    public static Pattern Numeric(){
        return new Pattern(new NumericVerifier()).msg("请输入有效的数值");
    }

    /**
     * 银行卡号
     * @return Pattern
     */
    public static Pattern BlankCard(){
        return new Pattern(new BlankCardVerifier()).msg("请输入有效的银行卡/信用卡号码");
    }

    /**
     * 身份证号
     * @return Pattern
     */
    public static Pattern ChineseIDCard(){
        return new Pattern(new IDCardVerifier()).msg("请输入有效的身份证号");
    }

    /**
     * 手机号
     * @return Pattern
     */
    public static Pattern ChineseMobile(){
        return new Pattern(new MobileVerifier()).msg("请输入有效的手机号");
    }

    /**
     * 为True状态
     * @return Pattern
     */
    public static Pattern IsTrue(){
        return new Pattern(new BoolVerifier(true)).msg("当前项必须为True");
    }

    /**
     * 为False状态
     * @return Pattern
     */
    public static Pattern IsFalse(){
        return new Pattern(new BoolVerifier(false)).msg("当前项必须为False");
    }

}
