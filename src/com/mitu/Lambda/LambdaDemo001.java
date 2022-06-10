package com.mitu.Lambda;

public class LambdaDemo001 {
    public static void main(String[] args) {
        //Lambda 简化匿名内部类格式
        Animal ani = () -> System.out.println("running.....");
        Animal a = () -> {
            System.out.println("aa running.....");
        };
        ani.run();
        a.run();
    }
}

@FunctionalInterface
interface Animal{
    void run();
}
