package com.github.yoojia.inputs;

/**
 * 桥接两个数值(A\B)及数据转换的接口
 * @author 陈小锅 (yoojia.chen@gmail.com)
 * @since 1.1
 */
public abstract class ABBridge<T> {

    /**
     * @return Value A
     */
    public abstract T getValueA();

    /**
     * @return Value B
     */
    public T getValueB(){
        return null;
    }

    /**
     * 将String输入转换为泛型目标类型的数值
     * @param input String input
     * @return typed value
     */
    public abstract T stringToTyped(String input);

    /**
     * @param input Input value
     * @param valueA Value A
     * @param valueB Value B
     * @return test result
     */
    public abstract boolean performVerify(T input, T valueA, T valueB);
}