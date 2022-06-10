package com.mitu.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class CollectionDemo001 {
    public static void main(String[] args) {

        //有序 可重复 有索引
        Collection list01 = new ArrayList();
        list01.add("12");
        list01.add(123);
        list01.add(123);
        list01.add("java");
        list01.add("12");
        list01.add("12");
        System.out.println(list01);

        //无序 不可重复 无索引
        Collection list02 = new HashSet();
        list02.add("12");
        list02.add(123);
        list02.add(123);
        list02.add("java");
        list02.add("12");
        list02.add("12");
        System.out.println(list02);

        //支持泛型 必须使用引用数据类型
        Collection<Integer> list03 = new ArrayList<>();



    }


}
