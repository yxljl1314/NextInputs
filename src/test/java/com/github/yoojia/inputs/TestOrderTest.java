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
                    @Override public String getValue() {
                        return "hahaha";
                    }
                },
                new Pattern(new OrderedVerifier(orderedBuff, "0")),
                new Pattern(new OrderedVerifier(orderedBuff, "1")),
                new Pattern(new OrderedVerifier(orderedBuff, "2")),
                new Pattern(new OrderedVerifier(orderedBuff, "3")).priority(StaticPattern.PRIORITY_REQUIRED),
                new Pattern(new OrderedVerifier(orderedBuff, "4")).priority(Integer.MAX_VALUE),
                new Pattern(new OrderedVerifier(orderedBuff, "5")).priority(Integer.MIN_VALUE)
        );

        Assert.assertTrue(inputs.test());
        Assert.assertEquals("530124", orderedBuff.toString());
    }

    private static class OrderedVerifier implements Verifier {

        private final StringBuilder mBuff;
        private final String mTag;

        private OrderedVerifier(StringBuilder mBuff, String mTag) {
            this.mBuff = mBuff;
            this.mTag = mTag;
        }

        @Override
        public boolean perform(String rawInput) throws Exception {
            mBuff.append(mTag);
            return true;
        }
    }
}
