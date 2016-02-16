package com.github.yoojia.inputs;

/**
 * A\B Values test bridge
 * @author 陈小锅 (yoojia.chen@gmail.com)
 * @since 1.1
 */
public abstract class ABBridge<T> {

    /**
     * @return Value A
     */
    protected abstract T getValueA();

    /**
     * @return Value B
     */
    protected T getValueB(){
        return null;
    }

    /**
     * Convert String input to Typed value
     * @param input String input
     * @return typed value
     */
    protected abstract T stringToTyped(String input);

    /**
     * @param input Input value
     * @param valueA Value A
     * @param valueB Value B
     * @return test result
     */
    protected abstract boolean performTest(T input, T valueA, T valueB);
}