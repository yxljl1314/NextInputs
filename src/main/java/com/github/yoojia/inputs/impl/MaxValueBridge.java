package com.github.yoojia.inputs.impl;

/**
 * @author Yoojia Chen (yoojiachen@gmail.com)
 * @since 1.1
 */
public class MaxValueBridge extends ValueBridge{

    public MaxValueBridge(Double valueA) {
        super(valueA, null);
    }

    public MaxValueBridge(Float valueA) {
        super(valueA, null);
    }

    public MaxValueBridge(Long valueA) {
        super(valueA, null);
    }

    public MaxValueBridge(Integer valueA) {
        super(valueA, null);
    }

    @Override
    public boolean performVerify(Double input, Double valueA, Double valueB) {
        return input <= valueA;
    }
}
