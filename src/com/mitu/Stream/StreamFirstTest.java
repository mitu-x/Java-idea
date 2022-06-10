package com.mitu.Stream;

import java.util.ArrayList;
import java.util.List;

/**
 * 体验Stream流的使用
 */
public class StreamFirstTest {
    public static void main(String[] args) {
        //1.传统方式集合
        List<String> sets = new ArrayList<>();
        sets.add("张无忌");
        sets.add("张三丰");
        sets.add("周芷若");
        sets.add("小昭");
        sets.add("张翠山");
        sets.add("张三");
        System.out.println(sets);

        //  把姓张的 放到新集合
        List<String> zhangList = new ArrayList<>();
        for (String set : sets) {
            if (set.startsWith("张")) {
                zhangList.add(set);
            }
        }
        System.out.println(zhangList);

        // 把  三个字  的  张姓人  放到一个 集合
        List<String> zhangThreeList = new ArrayList<>();
        for (String s : zhangList) {
            if (s.length() == 3) {
                zhangThreeList.add(s);
            }
        }
        System.out.println(zhangThreeList);


        //使用  stream  实现上述效果
        sets.stream().filter(s -> s.startsWith("张")).filter(s -> s.length() == 3).forEach(System.out::println);

    }
}
