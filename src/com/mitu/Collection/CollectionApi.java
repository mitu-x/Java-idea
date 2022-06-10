package com.mitu.Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class CollectionApi {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        //添加
        list.add("Html");
        list.add("Jtml");
        //清空
       // list.clear();
        //判断是否为空
        System.out.println(list.isEmpty());//false
        //计算 大小
        System.out.println(list.size());//1
        //是否包含某个元素
        System.out.println(list.contains("Html"));//true
        System.out.println(list.contains("html"));//false
        //删除元素  如果有重复默认删除前面一个
        list.remove("Jtml");
        //把集合转换成数组
        Object[] arrs = list.toArray();
        System.out.println(Arrays.toString(arrs));

        System.out.println("-----拓展----");
        Collection<String> c1 = new ArrayList<>();
        c1.add("1a");
        c1.add("1b");
        c1.add("1c");
        Collection<String> c2 = new ArrayList<>();
        c2.add("2a");
        c2.add("2b");
        c2.add("2c");
        //合并两个集合
        c1.addAll(c2);
        //只是把c2加到了c1 c2的数据还在
        System.out.println(c1);


    }
}
