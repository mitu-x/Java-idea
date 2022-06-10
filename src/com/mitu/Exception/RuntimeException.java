package com.mitu.Exception;

/**
 * 常见的运行时异常
 * 编译阶段不保错    运行时报错
 */
public class RuntimeException {
    public static void main(String[] args) {

        /*----RuntimeException-------*/
        System.out.println("------Start---------");
        /*-------1. 数组索引越界异常：ArrayIndexOutOfBoundsException--------------*/
        int[] arr = {1,2,3,4,5};
        try {
            System.out.println(arr[5]);//运行出错，程序终止
        } catch (Exception e) {
            e.printStackTrace();
        }//捕获异常  不会终止程序   结束抛出异常

        /*---2.空指针异常：NullPointerException-------------------------*/
        String name = null;
        System.out.println(name);
//        System.out.println(name.length());//运行出错，程序终止

        /*---3.类型转换异常：ClassCastException-------------------------*/
        Object o =123;
//        String s = (String) o;
//        System.out.println(s);//运行出错，程序终止

        /*---4.数学操作异常：ArithmeticException-------------------------*/
//        int i = 10/0;
//        System.out.println(i);

        /*---5.数字转换异常： NumberFormatException-------------------------*/
//        String num = "12311aa   ";
//        Integer i = Integer.valueOf(num);
//        System.out.println(i);
        System.out.println("------end---");



    }
}
