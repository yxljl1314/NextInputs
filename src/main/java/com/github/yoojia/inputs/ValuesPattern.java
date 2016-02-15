package com.github.yoojia.inputs;

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
        return new Pattern(new AllowEmptyTester() {
            @Override
            public boolean performTestNotEmpty(String input) throws Exception {
                return input.length() >= minLength;
            }
        })
        .msgOnFail("输入内容长度必须不少于：" + minLength)
        .priority(PRIORITY_GENERAL);
    }

    public static Pattern MaxLength(final int maxLength) {
        return new Pattern(new AllowEmptyTester() {
            @Override
            public boolean performTestNotEmpty(String input) throws Exception {
                return input.length() <= maxLength;
            }
        })
        .msgOnFail("输入内容长度必须不多于：" + maxLength)
        .priority(PRIORITY_GENERAL);
    }

    public static Pattern RangeLength(final int minLength, final int maxLength) {
        return new Pattern(new AllowEmptyTester() {
            @Override
            public boolean performTestNotEmpty(String input) throws Exception {
                final int length = input.length();
                return minLength <= length && length <= maxLength;
            }
        })
        .msgOnFail("输入内容长度必须在[" + maxLength + "," + maxLength + "]之间")
        .priority(PRIORITY_GENERAL);
    }

    public static Pattern MinValue(final int minValue) {
        return ABTest(new ABTestBridge<Integer>() {
            @Override
            protected Integer onValueA() {
                return minValue;
            }

            @Override
            protected Integer stringToValue(String input) {
                return Integer.valueOf(input);
            }

            @Override
            protected boolean performTest(Integer input, Integer valueA, Integer valueB) {
                return input >= valueA;
            }
        }).msgOnFail("输入数值大小必须不小于：" + minValue);
    }

    public static Pattern MinValue(final long minValue) {
        return ABTest(new ABTestBridge<Long>() {
            @Override
            protected Long onValueA() {
                return minValue;
            }

            @Override
            protected Long stringToValue(String input) {
                return Long.valueOf(input);
            }

            @Override
            protected boolean performTest(Long input, Long valueA, Long valueB) {
                return input >= valueA;
            }
        }).msgOnFail("输入数值大小必须不小于：" + minValue);
    }

    public static Pattern MinValue(final float minValue) {
        return ABTest(new ABTestBridge<Float>() {
            @Override
            protected Float onValueA() {
                return minValue;
            }

            @Override
            protected Float stringToValue(String input) {
                return Float.valueOf(input);
            }

            @Override
            protected boolean performTest(Float input, Float valueA, Float valueB) {
                return input >= valueA;
            }
        }).msgOnFail("输入数值大小必须不小于：" + minValue);
    }

    public static Pattern MinValue(final double minValue) {
        return ABTest(new ABTestBridge<Double>() {
            @Override
            protected Double onValueA() {
                return minValue;
            }

            @Override
            protected Double stringToValue(String input) {
                return Double.valueOf(input);
            }

            @Override
            protected boolean performTest(Double input, Double valueA, Double valueB) {
                return input >= valueA;
            }
        }).msgOnFail("输入数值大小必须不小于：" + minValue);
    }

    public static Pattern MaxValue(final int maxValue) {
        return ABTest(new ABTestBridge<Integer>() {
            @Override
            protected Integer onValueA() {
                return maxValue;
            }

            @Override
            protected Integer stringToValue(String input) {
                return Integer.valueOf(input);
            }

            @Override
            protected boolean performTest(Integer input, Integer valueA, Integer valueB) {
                return input <= valueA;
            }
        }).msgOnFail("输入数值大小必须不大于：" + maxValue);
    }

    public static Pattern MaxValue(final long maxValue) {
        return ABTest(new ABTestBridge<Long>() {
            @Override
            protected Long onValueA() {
                return maxValue;
            }

            @Override
            protected Long stringToValue(String input) {
                return Long.valueOf(input);
            }

            @Override
            protected boolean performTest(Long input, Long valueA, Long valueB) {
                return input <= valueA;
            }
        }).msgOnFail("输入数值大小必须不大于：" + maxValue);
    }

    public static Pattern MaxValue(final float maxValue) {
        return ABTest(new ABTestBridge<Float>() {
            @Override
            protected Float onValueA() {
                return maxValue;
            }

            @Override
            protected Float stringToValue(String input) {
                return Float.valueOf(input);
            }

            @Override
            protected boolean performTest(Float input, Float valueA, Float valueB) {
                return input <= valueA;
            }
        }).msgOnFail("输入数值大小必须不大于：" + maxValue);
    }

    public static Pattern MaxValue(final double maxValue) {
        return ABTest(new ABTestBridge<Double>() {
            @Override
            protected Double onValueA() {
                return maxValue;
            }

            @Override
            protected Double stringToValue(String input) {
                return Double.valueOf(input);
            }

            @Override
            protected boolean performTest(Double input, Double valueA, Double valueB) {
                return input <= valueA;
            }
        }).msgOnFail("输入数值大小必须不大于：" + maxValue);
    }

    public static Pattern RangeValue(final int minValue, final int maxValue) {
        return ABTest(new ABTestBridge<Integer>() {
            @Override
            protected Integer onValueA() {
                return minValue;
            }

            @Override
            protected Integer onValueB() {
                return maxValue;
            }

            @Override
            protected Integer stringToValue(String input) {
                return Integer.valueOf(input);
            }

            @Override
            protected boolean performTest(Integer input, Integer valueA, Integer valueB) {
                return valueA <= input && input <= valueB;
            }
        }).msgOnFail("输入数值大小必须在[" + minValue + "," + maxValue + "]之间");
    }

    public static Pattern RangeValue(final long minValue, final long maxValue) {
        return ABTest(new ABTestBridge<Long>() {
            @Override
            protected Long onValueA() {
                return minValue;
            }

            @Override
            protected Long onValueB() {
                return maxValue;
            }

            @Override
            protected Long stringToValue(String input) {
                return Long.valueOf(input);
            }

            @Override
            protected boolean performTest(Long input, Long valueA, Long valueB) {
                return valueA <= input && input <= valueB;
            }
        }).msgOnFail("输入数值大小必须在[" + minValue + "," + maxValue + "]之间");
    }

    public static Pattern RangeValue(final float minValue, final float maxValue) {
        return ABTest(new ABTestBridge<Float>() {
            @Override
            protected Float onValueA() {
                return minValue;
            }

            @Override
            protected Float onValueB() {
                return maxValue;
            }

            @Override
            protected Float stringToValue(String input) {
                return Float.valueOf(input);
            }

            @Override
            protected boolean performTest(Float input, Float valueA, Float valueB) {
                return valueA <= input && input <= valueB;
            }
        }).msgOnFail("输入数值大小必须在[" + minValue + "," + maxValue + "]之间");
    }

    public static Pattern RangeValue(final double minValue, final double maxValue) {
        return ABTest(new ABTestBridge<Double>() {
            @Override
            protected Double onValueA() {
                return minValue;
            }

            @Override
            protected Double onValueB() {
                return maxValue;
            }

            @Override
            protected Double stringToValue(String input) {
                return Double.valueOf(input);
            }

            @Override
            protected boolean performTest(Double input, Double valueA, Double valueB) {
                return valueA <= input && input <= valueB;
            }
        }).msgOnFail("输入数值大小必须在[" + minValue + "," + maxValue + "]之间");
    }

    public static Pattern EqualsTo(final Loader<String> loader){
        return ABTest(new ABTestBridge<String>() {
            @Override
            protected String onValueA() {
                return loader.onLoadValue();
            }

            @Override
            protected String stringToValue(String input) {
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
        return ABTest(new ABTestBridge<String>() {
            @Override
            protected String onValueA() {
                return loader.onLoadValue();
            }

            @Override
            protected String stringToValue(String input) {
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

    public static <T> Pattern ABTest(final ABTestBridge<T> bridge) {
        return new Pattern(new AllowEmptyTester() {
            @Override
            public boolean performTestNotEmpty(String input) throws Exception {
                final T value = bridge.stringToValue(input);
                return bridge.performTest(value, bridge.onValueA(), bridge.onValueB());
            }
        }).priority(PRIORITY_GENERAL);
    }

}
