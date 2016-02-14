package com.github.yoojia.inputs;

/**
 * @author 陈小锅 (yoojia.chen@gmail.com)
 */
public abstract class ABTypedTester<T> {

    protected abstract T onValueA();

    protected T onValueB(){
        return null;
    }

    protected abstract T valueOf(String input);

    protected abstract boolean test(T input, T valueA, T valueB);
}