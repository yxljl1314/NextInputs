package com.github.yoojia.inputs.testers;

/**
 * @author Yoojia Chen (yoojiachen@gmail.com)
 * @since 1.1
 */
public class RangeValueBridge extends ValueBridge{

    public RangeValueBridge(Double valueA, Double valueB) {
        super(valueA, valueB);
    }

    public RangeValueBridge(Float valueA, Float valueB) {
        super(valueA, valueB);
    }

    public RangeValueBridge(Long valueA, Long valueB) {
        super(valueA, valueB);
    }

    public RangeValueBridge(Integer valueA, Integer valueB) {
        super(valueA, valueB);
    }

    @Override
    public boolean performVerify(Double input, Double valueA, Double valueB) {
        return valueA <= input && input <= valueB;
    }
}
