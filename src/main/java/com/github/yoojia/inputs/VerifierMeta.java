package com.github.yoojia.inputs;

/**
 * @author 陈小锅 (yoojia.chen@gmail.com)
 */
class VerifierMeta {

    public final Input input;
    public final Pattern[] patterns;

    public VerifierMeta(Input input, Pattern[] patterns) {
        this.input = input;
        this.patterns = patterns;
    }
}
