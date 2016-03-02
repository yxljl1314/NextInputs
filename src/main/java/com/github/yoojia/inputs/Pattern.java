package com.github.yoojia.inputs;

/**
 * 校验模式
 * @author 陈小锅 (yoojia.chen@gmail.com)
 */
public class Pattern {

    /**
     * 当验证失败时的提示消息
     */
    String message;

    /**
     * 验证顺序优先级.默认为 StaticPattern.PRIORITY_GENERAL
     * @see StaticPattern
     */
    int orderPriority = StaticPattern.PRIORITY_GENERAL;

    /**
     * 具体校验算法实现接口
     */
    final Verifier mVerifier;

    public Pattern(Verifier verifier) {
        this.mVerifier = verifier;
    }

    public Pattern msgOnFail(String message){
        return msg(message);
    }

    public Pattern priority(int priority){
        this.orderPriority = priority;
        return this;
    }

    public Pattern msg(String message){
        this.message = message;
        return this;
    }
}
