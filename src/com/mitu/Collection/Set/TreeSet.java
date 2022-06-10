package com.mitu.Collection.Set;


import com.mitu.generics.Student;

import java.util.Set;

public class TreeSet {
    public static void main(String[] args) {
        Set<String> s1 = new java.util.TreeSet<>();
        s1.add("A");
        s1.add("U");
        s1.add("B");
        s1.add("K");
        s1.add("w");
        s1.add("a");
        s1.add("T");
        s1.add("王");
        System.out.println(s1); //基本数据类型   自动排序

        /*
         * 需要在自定义类中 创造排序规则
         */
        Set<Student> s2 = new java.util.TreeSet<>((o1, o2) -> Double.compare(o2.getWeight(),o1.getWeight())); //自定义对象  使用 TreeSet集合无法自动排序
        s2.add(new Student("张三", 12, 48.9));
        s2.add(new Student("李青", 12, 46.4));
        s2.add(new Student("赵四", 17, 48.1));
        System.out.println(s2);

    }
}
