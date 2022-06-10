package com.mitu.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionIterator {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        c.add("张无忌");
        c.add("殷野王");
        c.add("小昭");
        c.add("张三丰");
        System.out.println(c);
        //得到当前集合的迭代器对象
        Iterator<String> it = c.iterator();
        //每用一个 it.next() 都往集合后移1位  并取出
        /*
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        */
        //使用while来循环取出集合内容

        while (it.hasNext()) {
            System.out.println(it.next());
        }
        //foreach  增强for遍历集合
        for (String s : c) {
            System.out.println(s);
        }

        System.out.println("--------------");
        //使用 Lambda表达式 + ForEach 遍历 集合
        c.forEach(System.out::println);

    }
}
