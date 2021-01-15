package com.panli.logback.chapters01.introduction;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author lipan
 * @date 2021-01-15
 * @desc
 */
public class HelloWorld1 {
    public static void main(String[] args) {

//        Logger logger = LoggerFactory.getLogger(HelloWorld1.class);
//        System.out.println(HelloWorld1.class);

        Logger logger = LoggerFactory.getLogger("com.panli.logback.chapters01.introduction.HelloWorld1");
        logger.debug("hello world");
    }
}
