package com.panli.logback.chapters02.architecture;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author lipan
 * @date 2021-01-15
 */
public class LogPerformanceTest {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(LogPerformanceTest.class);

//        long log1 = System.currentTimeMillis();
//        logger.debug("log1 performance test 1+1={}", 2); // 性能好
//        long log2 = System.currentTimeMillis();
//        System.out.println(log2 - log1);


        long logTime1 = System.currentTimeMillis();
        logger.debug("log2 performance test 1+1 = " + 2); // 性能差
        long logTime2 = System.currentTimeMillis();
        System.out.println(logTime2 - logTime1);
    }
}
