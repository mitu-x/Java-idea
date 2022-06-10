package com.mitu.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * Stream 的 常用api
 */
public class StreamAPIList {
    public static void main(String[] args) {
        List<String> sets = new ArrayList<>();
        sets.add("张无忌");
        sets.add("张三丰");
        sets.add("周芷若");
        sets.add("小昭");
        sets.add("张翠山");
        sets.add("张三");
        System.out.println(sets);

        //1.filter() 过滤选择
        //      Stream<T> filter(Predicate<? super T> predicate)
        sets.stream().filter(s -> s.length() == 3).forEach(System.out::println);

        //2.count() 计数
        System.out.println(sets.stream().filter(s -> s.length() == 3).count());

        //3.limit() 截取前几个
        sets.stream().limit(4).forEach(System.out::println);

        //4.skip() 跳过前几个
        sets.stream().skip(3).forEach(System.out::println);

        //5.map() 加工 : 第一个参数 原材料  第二个参数 加工后的结果
        // （例如： 给集合每个元素前面都加上“倚天屠龙”）
        sets.stream().map(s -> "倚天屠龙记--" + s).forEach(System.out::println);

        //concat() 合并流
        Stream<String> s1 = sets.stream().filter(s -> s.length() == 3);
        Stream<String> s2 = Stream.of("左冷禅","令狐冲");
        Stream<String> s3 = Stream.concat(s1,s2);
        s3.forEach(System.out::println);

        //distinct() 删除重复
        //forEach()  遍历流数据

    }
}
