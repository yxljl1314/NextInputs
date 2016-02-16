package com.github.yoojia.inputs.testers;

import com.github.yoojia.inputs.ABBridge;

/**
 * @author Yoojia Chen (yoojiachen@gmail.com)
 * @since 1.1
 */
abstract class ValueBridge extends ABBridge<Double>{

    private final Double mValueA;
    private final Double mValueB;

    public ValueBridge(Double valueA, Double valueB) {
        this.mValueA = valueA;
        this.mValueB = valueB;
    }

    public ValueBridge(Float valueA, Float valueB) {
        this.mValueA = valueA.doubleValue();
        this.mValueB = valueB.doubleValue();
    }

    public ValueBridge(Long valueA, Long valueB) {
        this.mValueA = valueA.doubleValue();
        this.mValueB = valueB.doubleValue();
    }

    public ValueBridge(Integer valueA, Integer valueB) {
        this.mValueA = valueA.doubleValue();
        this.mValueB = valueB.doubleValue();
    }

    @Override
    protected Double getValueA() {
        return mValueA;
    }

    @Override
    protected Double getValueB() {
        return mValueB;
    }

    @Override
    protected Double stringToTyped(String input) {
        return Double.valueOf(input);
    }

}
