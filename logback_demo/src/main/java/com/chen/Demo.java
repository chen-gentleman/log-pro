package com.chen;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author @Chenxc
 * @date 2023年02月25日 16:45
 */
public class Demo {
    private static final Logger LOGGER = LoggerFactory.getLogger(Demo.class);
    @Test
    public void test01(){
        LOGGER.error("error");
        LOGGER.warn("warn");
        LOGGER.info("info");//默认级别
        LOGGER.debug("debug");
        LOGGER.trace("trace");
    }
}
