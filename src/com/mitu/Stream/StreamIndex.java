package com.mitu.Stream;

import java.util.*;
import java.util.stream.Stream;

/**
 * Stream 支持链式方法
 *
 * 获取Stream流的 各种方法
 */
public class StreamIndex {
    public static void main(String[] args) {
        /*-------------------Collection集合获取Stream流---------------------*/
        Collection<String> list = new ArrayList<>();
        Stream<String> s = list.stream();

        /*-------------------Map集合获取Stream流---------------------*/
        Map<String,Integer> map = new HashMap<>();
        //键流
        Stream<String> keyS = map.keySet().stream();
        //值流
        Stream<Integer> valS = map.values().stream();
        //键值对流
        Stream<Map.Entry<String, Integer>> mapS = map.entrySet().stream();

        /*-------------------数组获取Stream流---------------------*/
        String[] names = {"小昭","赵敏","周芷若","殷离"};
        //方法一
        Stream<String> arrS = Arrays.stream(names);
        //方法二
        Stream<String> arrS2 = Stream.of(names);

    }
}
