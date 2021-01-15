package com.panli.logback.chapters02.architecture;

import ch.qos.logback.classic.Level;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author lipan
 * @date 2021-01-15
 * @desc 日志级别(从高到底)：OFF、ERROR、WARN、INFO、DEBUG、TRACE
 */
public class SelectRule {
    public static void main(String[] args) {

        // ch.qos.logback.classic.Logger 可以设置日志的级别
        // 获取一个名为 "com.foo" 的 logger 实例
        ch.qos.logback.classic.Logger logger = (ch.qos.logback.classic.Logger)LoggerFactory.getLogger("com.foo");

        // 设置 logger 的级别为INFO
        logger.setLevel(Level.INFO);

        // 可以打印 WARN >= INFO
        logger.warn("告警信息");

        // 不可以打印 DEBUG < INFO
        logger.debug("调试信息");

        // "com.foo.bar" 会继承 "com.foo" 的有效级别
        Logger barLogger = LoggerFactory.getLogger("com.foo.bar");
        // 可以打印：INFO >= INFO
        barLogger.info("子级INFO信息");
        // 不可以打印：DEBUG < INFO
        barLogger.debug("子级DEBUG信息");
    }
}
