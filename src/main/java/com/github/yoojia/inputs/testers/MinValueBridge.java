package com.github.yoojia.inputs.testers;

/**
 * @author Yoojia Chen (yoojiachen@gmail.com)
 * @since 1.1
 */
public class MinValueBridge extends ValueBridge{

    public MinValueBridge(Double valueA) {
        super(valueA, null);
    }

    public MinValueBridge(Float valueA) {
        super(valueA, null);
    }

    public MinValueBridge(Long valueA) {
        super(valueA, null);
    }

    public MinValueBridge(Integer valueA) {
        super(valueA, null);
    }

    @Override
    public boolean performVerify(Double input, Double valueA, Double valueB) {
        return input >= valueA;
    }
}
