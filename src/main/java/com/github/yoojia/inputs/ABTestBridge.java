package com.github.yoojia.inputs;

/**
 *
 * @author 陈小锅 (yoojia.chen@gmail.com)
 */
public abstract class ABTestBridge<T> {

    /**
     * @return Value A
     */
    protected abstract T onValueA();

    /**
     * @return Value B
     */
    protected T onValueB(){
        return null;
    }

    /**
     * Convert String input to Typed value
     * @param input String input
     * @return typed value
     */
    protected abstract T stringToValue(String input);

    /**
     * @param input Input value
     * @param valueA Value A
     * @param valueB Value B
     * @return test result
     */
    protected abstract boolean performTest(T input, T valueA, T valueB);
}