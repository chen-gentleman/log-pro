package com.chen;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.*;

/**
 * @author @Chenxc
 * @date 2023年02月16日 22:12
 */
public class Demo {

    @Test
    public void testBegin(){
        Logger logger = Logger.getLogger(Demo.class.getName());
        logger.severe("severe");
        logger.warning("warning");
        logger.info("info");
        logger.config("config");
        logger.fine("fine");
        logger.finest("finest");
    }

    //自定义日志级别配置
    @Test
    public void logConfig() throws IOException {
        Logger logger = Logger.getLogger(Demo.class.getName());
        //关闭系统默认配置
        logger.setUseParentHandlers(false);

        //创建控制太handle
        ConsoleHandler consoleHandler = new ConsoleHandler();
        Formatter formatter = new SimpleFormatter();

        consoleHandler.setFormatter(formatter);

        //输出到文件的handle
        FileHandler fileHandler = new FileHandler("C:\\Users\\Administrator\\Desktop\\log_output\\20230216.log");
        fileHandler.setFormatter(formatter);

        logger.setLevel(Level.ALL);
        consoleHandler.setLevel(Level.ALL);

        //添加两个handle 同时输出到控制台和文件
        logger.addHandler(consoleHandler);
        logger.addHandler(fileHandler);

        logger.severe("severe");
        logger.warning("warning");
        logger.info("info");
        logger.config("config");
        logger.fine("fine");
        logger.finest("finest");
    }

    @Test
    public void logProperties() throws Exception {
        LogManager logManager = LogManager.getLogManager();
        logManager.readConfiguration(Demo.class.getClassLoader().getResourceAsStream("logging.properties"));

        Logger logger = Logger.getLogger(Demo.class.getName());
        logger.severe("severe");
        logger.warning("warning");
        logger.info("info");
        logger.config("config");
        logger.fine("fine");
        logger.finest("finest");


        Logger logger2 = Logger.getLogger("com.chen");
        logger2.severe("severe test");
        logger2.warning("warning test");
        logger2.info("info test");
        logger2.config("config test");
        logger2.fine("fine test");
        logger2.finest("finest test");
    }

}
