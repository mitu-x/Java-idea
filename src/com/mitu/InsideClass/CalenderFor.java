package com.mitu.InsideClass;

import java.util.Calendar;

public class CalenderFor {
    public static void main(String[] args) {

        //1、获取系统日历对象
        Calendar cal001 = Calendar.getInstance();
//        System.out.println(cal001);

        //2、获取日历信息
        int year = cal001.get(Calendar.YEAR);
        int month = cal001.get(Calendar.MONTH) + 1;
        int doy = cal001.get(Calendar.DAY_OF_MONTH);
        int week = cal001.get(Calendar.DAY_OF_WEEK) - 1;
        System.out.print(year+"年");
        System.out.print(month+"月");
        System.out.print(doy+"日");
        System.out.print("周"+week);


    }

}
