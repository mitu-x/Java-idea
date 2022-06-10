package com.mitu.Collection.Set;

public class SetDemo002 {
    public static void main(String[] args) {
        //获取对象哈希值 同一个对象 哈希值  始终固定
        String name = "Hello";
        System.out.println(name.hashCode());
        System.out.println(name.hashCode());
    }
}

