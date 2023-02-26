package com.chen;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.helpers.LogLog;
import org.junit.Test;

/**
 * @author @Chenxc
 * @date 2023年02月18日 17:34
 */
public class Demo {
    @Test
    public void testQuick(){
        //开启log4j的内置日志记录
        LogLog.setInternalDebugging(true);
        //BasicConfigurator.configure();
        Logger logger = Logger.getLogger(Demo.class);

        for (int i = 0; i < 10000; i++) {
            logger.info("Hello log4j!");
            //六个日志级别
            logger.fatal("fatal");//严重错误
            logger.error("error");//错误
            logger.warn("warn");//警告
            logger.debug("debug");//调试信息
            logger.trace("trace");//追踪信息
        }

    }
}
