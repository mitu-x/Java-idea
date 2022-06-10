package com.mitu.Collection.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo001 {
    public static void main(String[] args) {
        /**
         * Set集合的特点
         * 1.无序
         * 2.不重复
         * 3.无索引
         * 实现类的贴点
         * hashset：无序 不重复 无索引
         * LinkedHashSet : 有序 不重复 无索引
         * TreeSet: 排序  不重复 无索引
         */
        Set<String> sets = new HashSet<>(); //无序 不重复 无索引
        sets.add("Java");
        sets.add("Java");
        sets.add("Html");
        sets.add("Html");
        sets.add("Mysql");
        sets.add("Mysql");
        System.out.println(sets);

        Set<String> sets1 = new LinkedHashSet<>(); //有序（根据添加顺序存储） 不重复 无索引
        sets1.add("Java");
        sets1.add("Java");
        sets1.add("Html");
        sets1.add("Html");
        sets1.add("Mysql");
        sets1.add("Mysql");
        System.out.println(sets1);

        Set<String> sets2 = new TreeSet<>(); //排序（有规则排序）  不重复 无索引
        sets2.add("Java");
        sets2.add("Java");
        sets2.add("Html");
        sets2.add("Html");
        sets2.add("Mysql");
        sets2.add("Mysql");
        sets2.add("A");
        System.out.println(sets2);

    }
}
