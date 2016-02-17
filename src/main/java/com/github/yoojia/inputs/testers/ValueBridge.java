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
        this.mValueA = valueA == null ? 0 : valueA.doubleValue();
        this.mValueB = valueB == null ? 0 : valueB.doubleValue();
    }

    public ValueBridge(Long valueA, Long valueB) {
        this.mValueA = valueA == null ? 0 : valueA.doubleValue();
        this.mValueB = valueB == null ? 0 : valueB.doubleValue();
    }

    public ValueBridge(Integer valueA, Integer valueB) {
        this.mValueA = valueA == null ? 0 : valueA.doubleValue();
        this.mValueB = valueB == null ? 0 : valueB.doubleValue();
    }

    @Override
    public Double getValueA() {
        return mValueA;
    }

    @Override
    public Double getValueB() {
        return mValueB;
    }

    @Override
    public Double stringToTyped(String input) {
        return Double.valueOf(input);
    }

}
