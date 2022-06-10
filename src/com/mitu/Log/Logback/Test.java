package com.mitu.Log.Logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * logback日志技术   记录到文件
 */
public class Test {
    //创建logback的日志对象
    public static final Logger LOGGER = LoggerFactory.getLogger("Test.class");
    public static void main(String[] args) {
        try {
            LOGGER.debug("开始执行了。。。");
            LOGGER.info("第二行日志开始执行。。。");
            int a = 10 ;
            int b = 0 ;
            LOGGER.trace("a="+a);
            LOGGER.trace("b="+b);
            System.out.println(a/2);
        } catch (Exception e) {
            e.printStackTrace();
            LOGGER.error("出现异常 "+e);
        }
    }
}
