package com.github.yoojia.inputs;

/**
 * Abstract interface for any Inputs
 *
 * @author 陈小锅 (yoojia.chen@gmail.com)
 */
public interface Input {

    /**
     * Load value from Inputs
     * @return String value
     */
    String onLoadValue();
}
