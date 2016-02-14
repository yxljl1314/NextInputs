package com.github.yoojia.inputs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/**
 * NextInputs
 *
 * @author 陈小锅 (yoojia.chen@gmail.com)
 */
public class NextInputs {

    private static final Comparator<Pattern> ORDERING = new Comparator<Pattern>() {
        @Override
        public int compare(Pattern lhs, Pattern rhs) {
            return lhs.priority - rhs.priority;
        }
    };

    private final ArrayList<TestMeta> mRules = new ArrayList<>();

    private MessageDisplay mMessageDisplay = new MessageDisplay() {
        @Override
        public void show(Input input, String message) {
            System.err.println("Check input fail: " + message);
        }
    };

    private boolean mStopOnFail = true;

    /**
     * 执行校验测试，并返回测试结果。
     * @return 校验测试结果是否成功
     */
    public boolean test(){
        try{
            for (TestMeta rule : mRules) {
                if ( ! performTest(rule) && mStopOnFail) {
                    return false;
                }
            }
            return true;
        }catch (Exception err) {
            throw new RuntimeException(err);
        }
    }

    /**
     * 添加输入条目及测试模式。
     * @param input 输入条目
     * @param patterns 测试模式
     * @return NextInputs
     */
    public NextInputs add(Input input, Pattern...patterns){
        if (patterns == null || patterns.length == 0){
            throw new IllegalArgumentException("Patterns is required !");
        }
        Arrays.sort(patterns, ORDERING);
        mRules.add(new TestMeta(input, patterns));
        return this;
    }

    /**
     * 在校验测试遇到失败时，是否停止校验
     * @param stopOnFail 是否停止
     */
    public void setStopOnFail(boolean stopOnFail){
        mStopOnFail = stopOnFail;
    }

    /**
     * 设置校验测试结果消息显示接口
     * @param display 消息显示接口。
     * @throws NullPointerException 当参数为Null时，抛出异常。
     */
    public void setMessageDisplay(MessageDisplay display){
        if (display == null) {
            throw new NullPointerException();
        }
        mMessageDisplay = display;
    }

    private boolean performTest(TestMeta meta) throws Exception {
        final String value = meta.input.onLoadValue();
        for (Pattern pattern : meta.patterns) {
            if ( ! pattern.tester.performTest(value)) {
                mMessageDisplay.show(meta.input, pattern.message);
                return false;
            }
        }
        return true;
    }

}
