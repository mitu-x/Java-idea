package com.mitu.Exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 编译时异常
 * 编译阶段报错
 *
 * 处理方法：
 * 1.Throws 抛出异常
 * 2.Try...catch... 监视捕获处理
 * 3.
 */
public class NotRuntimeException {
    public static void main(String[] args) throws ParseException {
        String date = "2020-11-11 10:20:21";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d = sdf.parse(date);
        System.out.println(d);
    }
}
