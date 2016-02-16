package com.github.yoojia.inputs;

import com.github.yoojia.inputs.testers.MinLengthTester;
import com.github.yoojia.inputs.testers.RangeLengthTester;

/**
 * @author 陈小锅 (yoojia.chen@gmail.com)
 */
public class ValuesPattern {

    public static final int PRIORITY_REQUIRED = StaticPattern.PRIORITY_REQUIRED;
    public static final int PRIORITY_GENERAL = StaticPattern.PRIORITY_GENERAL;

    public static Pattern Required(){
        return StaticPattern.Required();
    }

    public static Pattern MinLength(final int minLength) {
        return new Pattern(new MinLengthTester(minLength)).msgOnFail("输入内容长度必须不少于：" + minLength);
    }

    public static Pattern MaxLength(final int maxLength) {
        return new Pattern(new MinLengthTester(maxLength)).msgOnFail("输入内容长度必须不多于：" + maxLength);
    }

    public static Pattern RangeLength(final int min, final int max) {
        return new Pattern(new RangeLengthTester(min, max)).msgOnFail("输入内容长度必须在[" + max + "," + max + "]之间");
    }

    public static Pattern MinValue(final int minValue) {
        return ABTest(new ABBridge<Integer>() {
            @Override
            protected Integer getValueA() {
                return minValue;
            }

            @Override
            protected Integer stringToTyped(String input) {
                return Integer.valueOf(input);
            }

            @Override
            protected boolean performTest(Integer input, Integer valueA, Integer valueB) {
                return input >= valueA;
            }
        }).msgOnFail("输入数值大小必须不小于：" + minValue);
    }

    public static Pattern MinValue(final long minValue) {
        return ABTest(new ABBridge<Long>() {
            @Override
            protected Long getValueA() {
                return minValue;
            }

            @Override
            protected Long stringToTyped(String input) {
                return Long.valueOf(input);
            }

            @Override
            protected boolean performTest(Long input, Long valueA, Long valueB) {
                return input >= valueA;
            }
        }).msgOnFail("输入数值大小必须不小于：" + minValue);
    }

    public static Pattern MinValue(final float minValue) {
        return ABTest(new ABBridge<Float>() {
            @Override
            protected Float getValueA() {
                return minValue;
            }

            @Override
            protected Float stringToTyped(String input) {
                return Float.valueOf(input);
            }

            @Override
            protected boolean performTest(Float input, Float valueA, Float valueB) {
                return input >= valueA;
            }
        }).msgOnFail("输入数值大小必须不小于：" + minValue);
    }

    public static Pattern MinValue(final double minValue) {
        return ABTest(new ABBridge<Double>() {
            @Override
            protected Double getValueA() {
                return minValue;
            }

            @Override
            protected Double stringToTyped(String input) {
                return Double.valueOf(input);
            }

            @Override
            protected boolean performTest(Double input, Double valueA, Double valueB) {
                return input >= valueA;
            }
        }).msgOnFail("输入数值大小必须不小于：" + minValue);
    }

    public static Pattern MaxValue(final int maxValue) {
        return ABTest(new ABBridge<Integer>() {
            @Override
            protected Integer getValueA() {
                return maxValue;
            }

            @Override
            protected Integer stringToTyped(String input) {
                return Integer.valueOf(input);
            }

            @Override
            protected boolean performTest(Integer input, Integer valueA, Integer valueB) {
                return input <= valueA;
            }
        }).msgOnFail("输入数值大小必须不大于：" + maxValue);
    }

    public static Pattern MaxValue(final long maxValue) {
        return ABTest(new ABBridge<Long>() {
            @Override
            protected Long getValueA() {
                return maxValue;
            }

            @Override
            protected Long stringToTyped(String input) {
                return Long.valueOf(input);
            }

            @Override
            protected boolean performTest(Long input, Long valueA, Long valueB) {
                return input <= valueA;
            }
        }).msgOnFail("输入数值大小必须不大于：" + maxValue);
    }

    public static Pattern MaxValue(final float maxValue) {
        return ABTest(new ABBridge<Float>() {
            @Override
            protected Float getValueA() {
                return maxValue;
            }

            @Override
            protected Float stringToTyped(String input) {
                return Float.valueOf(input);
            }

            @Override
            protected boolean performTest(Float input, Float valueA, Float valueB) {
                return input <= valueA;
            }
        }).msgOnFail("输入数值大小必须不大于：" + maxValue);
    }

    public static Pattern MaxValue(final double maxValue) {
        return ABTest(new ABBridge<Double>() {
            @Override
            protected Double getValueA() {
                return maxValue;
            }

            @Override
            protected Double stringToTyped(String input) {
                return Double.valueOf(input);
            }

            @Override
            protected boolean performTest(Double input, Double valueA, Double valueB) {
                return input <= valueA;
            }
        }).msgOnFail("输入数值大小必须不大于：" + maxValue);
    }

    public static Pattern RangeValue(final int minValue, final int maxValue) {
        return ABTest(new ABBridge<Integer>() {
            @Override
            protected Integer getValueA() {
                return minValue;
            }

            @Override
            protected Integer getValueB() {
                return maxValue;
            }

            @Override
            protected Integer stringToTyped(String input) {
                return Integer.valueOf(input);
            }

            @Override
            protected boolean performTest(Integer input, Integer valueA, Integer valueB) {
                return valueA <= input && input <= valueB;
            }
        }).msgOnFail("输入数值大小必须在[" + minValue + "," + maxValue + "]之间");
    }

    public static Pattern RangeValue(final long minValue, final long maxValue) {
        return ABTest(new ABBridge<Long>() {
            @Override
            protected Long getValueA() {
                return minValue;
            }

            @Override
            protected Long getValueB() {
                return maxValue;
            }

            @Override
            protected Long stringToTyped(String input) {
                return Long.valueOf(input);
            }

            @Override
            protected boolean performTest(Long input, Long valueA, Long valueB) {
                return valueA <= input && input <= valueB;
            }
        }).msgOnFail("输入数值大小必须在[" + minValue + "," + maxValue + "]之间");
    }

    public static Pattern RangeValue(final float minValue, final float maxValue) {
        return ABTest(new ABBridge<Float>() {
            @Override
            protected Float getValueA() {
                return minValue;
            }

            @Override
            protected Float getValueB() {
                return maxValue;
            }

            @Override
            protected Float stringToTyped(String input) {
                return Float.valueOf(input);
            }

            @Override
            protected boolean performTest(Float input, Float valueA, Float valueB) {
                return valueA <= input && input <= valueB;
            }
        }).msgOnFail("输入数值大小必须在[" + minValue + "," + maxValue + "]之间");
    }

    public static Pattern RangeValue(final double minValue, final double maxValue) {
        return ABTest(new ABBridge<Double>() {
            @Override
            protected Double getValueA() {
                return minValue;
            }

            @Override
            protected Double getValueB() {
                return maxValue;
            }

            @Override
            protected Double stringToTyped(String input) {
                return Double.valueOf(input);
            }

            @Override
            protected boolean performTest(Double input, Double valueA, Double valueB) {
                return valueA <= input && input <= valueB;
            }
        }).msgOnFail("输入数值大小必须在[" + minValue + "," + maxValue + "]之间");
    }

    public static Pattern EqualsTo(final Loader<String> loader){
        return ABTest(new ABBridge<String>() {
            @Override
            protected String getValueA() {
                return loader.onLoadValue();
            }

            @Override
            protected String stringToTyped(String input) {
                return input;
            }

            @Override
            protected boolean performTest(String input, String valueA, String valueB) {
                return input.equals(valueA);
            }
        }).msgOnFail("输入内容与要求不一致");
    }

    public static Pattern EqualsTo(final String fixedValue) {
        return EqualsTo(new Loader<String>() {
            @Override
            public String onLoadValue() {
                return fixedValue;
            }
        });
    }

    public static Pattern NotEqualsTo(final Loader<String> loader){
        return ABTest(new ABBridge<String>() {
            @Override
            protected String getValueA() {
                return loader.onLoadValue();
            }

            @Override
            protected String stringToTyped(String input) {
                return input;
            }

            @Override
            protected boolean performTest(String input, String valueA, String valueB) {
                return !input.equals(valueA);
            }
        }).msgOnFail("输入内容不能与要求的相同");
    }

    public static Pattern NotEqualsTo(final String fixedValue) {
        return NotEqualsTo(new Loader<String>() {
            @Override
            public String onLoadValue() {
                return fixedValue;
            }
        });
    }

    public static <T> Pattern ABTest(final ABBridge<T> bridge) {
        return new Pattern(new EmptyableTester() {
            @Override
            public boolean performTestNotEmpty(String input) throws Exception {
                final T value = bridge.stringToTyped(input);
                return bridge.performTest(value, bridge.getValueA(), bridge.getValueB());
            }
        }).priority(PRIORITY_GENERAL);
    }

}
