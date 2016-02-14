package com.github.yoojia.inputs;

/**
 * @author 陈小锅 (yoojia.chen@gmail.com)
 */
public abstract class ABTestBridge<T> {

    protected abstract T onValueA();

    protected T onValueB(){
        return null;
    }

    protected abstract T stringToValue(String input);

    protected abstract boolean onTest(T input, T valueA, T valueB);
}