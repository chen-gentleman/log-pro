package com.chen;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author @Chenxc
 * @date 2023年02月23日 22:30
 */
public class Slf4jTest {
    public static final Logger LOGGER = LoggerFactory.getLogger(Slf4jTest.class);
    @Test
    public void test1(){
        LOGGER.error("error");
        LOGGER.warn("warn");
        LOGGER.info("info");//默认级别
        LOGGER.debug("debug");
        LOGGER.trace("trace");
        LOGGER.info("=>>{},{}","hahah",2);

        try{
            int i = 1/0;
        }catch (Exception e){
            LOGGER.error("error: ",e);
        }

    }
}
