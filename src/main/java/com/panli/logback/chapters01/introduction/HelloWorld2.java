package com.panli.logback.chapters01.introduction;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.util.StatusPrinter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author lipan
 * @date 2021-01-15
 * @desc
 */
public class HelloWorld2 {
    public static void main(String[] args) {

        Logger logger = LoggerFactory.getLogger(HelloWorld2.class);
        logger.debug("hello world");

        // 打印内部状态
        LoggerContext lc = (LoggerContext) LoggerFactory.getILoggerFactory();
        StatusPrinter.print(lc);

    }
}
