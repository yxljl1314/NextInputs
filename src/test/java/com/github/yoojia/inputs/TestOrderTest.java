package com.github.yoojia.inputs;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author 陈小锅 (yoojia.chen@gmail.com)
 */
public class TestOrderTest {

    @Test
    public void testOrder(){
        final NextInputs inputs = new NextInputs();
        final StringBuilder orderedBuff = new StringBuilder();
        inputs.add(
                new Input() {
                    @Override public String onLoadValue() {
                        return "hahaha";
                    }
                },
                new Pattern(new OrderedTester(orderedBuff, "0")),
                new Pattern(new OrderedTester(orderedBuff, "1")),
                new Pattern(new OrderedTester(orderedBuff, "2")),
                new Pattern(new OrderedTester(orderedBuff, "3")).priority(StaticPattern.PRIORITY_REQUIRED),
                new Pattern(new OrderedTester(orderedBuff, "4")).priority(Integer.MAX_VALUE),
                new Pattern(new OrderedTester(orderedBuff, "5")).priority(Integer.MIN_VALUE)
        );

        Assert.assertTrue(inputs.test());
        Assert.assertEquals("530124", orderedBuff.toString());
    }

    private static class OrderedTester implements Tester {

        private final StringBuilder mBuff;
        private final String mTag;

        private OrderedTester(StringBuilder mBuff, String mTag) {
            this.mBuff = mBuff;
            this.mTag = mTag;
        }

        @Override
        public boolean performTest(String rawInput) throws Exception {
            mBuff.append(mTag);
            return true;
        }
    }
}
