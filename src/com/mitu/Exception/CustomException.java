package com.mitu.Exception;

public class CustomException {
    public static void main(String[] args) {
        try {
            check(-23);
        } catch (AgeException e) {
            e.printStackTrace();
        }

    }
    public static void check(int s) throws AgeException {
        if (s < 0 || s > 200) {
            //抛出异常
            //throws: 用在方法申明上，抛出方法内部的异常
            //throw：在方法内部直接创建一个异常对象并抛出
            throw new AgeException(s + " is illegal!");
        }else {
            System.out.println("OK");
        }
    }
}
