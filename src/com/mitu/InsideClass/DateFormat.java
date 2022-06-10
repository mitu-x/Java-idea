package com.mitu.InsideClass;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {
    public static void main(String[] args) throws ParseException {
        System.out.println(4.0);
        System.out.println(Math.abs(-10));
        long startTime = System.currentTimeMillis();
        long endTime = System.currentTimeMillis();
        System.out.println((endTime - startTime) / 1000.0);

/*
  Date api处理时间
 */
        Date d1 = new Date();
        System.out.println(d1);

        long d2 = d1.getTime();
        System.out.println(d2);
//格式化时间
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss EEE a");
        String str1 = sdf.format(d1);
        String str2 = sdf.format(d2);
        System.out.println(str1);
        System.out.println(str2);
//解析时间
        SimpleDateFormat sdf001 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        String strIn = "1970年01月01日 17:28:12";
        Date d3 = sdf001.parse(strIn);
        long d4 = d3.getTime();
        System.out.println(d3);
        System.out.println(d4);
    }
}
