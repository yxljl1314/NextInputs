package com.github.yoojia.inputs;

/**
 * Test rule Wrapper
 *
 * @author 陈小锅 (yoojia.chen@gmail.com)
 */
public class Pattern {

    String message;
    int priority = StaticPattern.PRIORITY_GENERAL;
    final AbstractTester tester;

    public Pattern(AbstractTester tester) {
        this.tester = tester;
    }

    public Pattern msgOnFail(String message){
        return msg(message);
    }

    public Pattern priority(int priority){
        this.priority = priority;
        return this;
    }

    public Pattern msg(String message){
        this.message = message;
        return this;
    }
}
