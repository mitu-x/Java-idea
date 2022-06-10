package com.mitu.Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Map体系的特点：键值对  无序  不重复  无索引  值任意
 */
public class mapIndex {
    public static void main(String[] args) {
        //1.创建一个Map对象//
        Map<String, Integer> maps = new HashMap<>();
        maps.put("安踏", 300);
        maps.put("Java", 300);
        maps.put("枸杞", 300);
        maps.put("null", 300);
        maps.put(null, null);
        //{null=null, Java=300, null=300, 枸杞=300, 安踏=300}
        System.out.println(maps);

        //链表式哈希表  有序
        Map<String, Integer> maps01 = new LinkedHashMap<>();
        maps01.put("安踏", 300);
        maps01.put("Java", 300);
        maps01.put("枸杞", 300);
        maps01.put("null", 300);
        maps01.put(null, null);
        //{安踏=300, Java=300, 枸杞=300, null=300, null=null}
        System.out.println(maps01);

        System.out.println("---------------基本使用API----------------");
        //2.清空
        //maps.clear();
        //3.判断是否为空
        boolean empty = maps.isEmpty();
        System.out.println(empty);
        //4.根据键取值
        Integer in = maps.get("Java");

        //5.根据键值移除元素
        maps.remove("安踏");
        System.out.println(maps);

        //6.判断是否包含某个键或者值
        System.out.println(maps.containsKey("Java")); //true
        System.out.println(maps.containsValue(300)); //true

        //7.获取全部键的集合
        Set<String> set = maps.keySet();
        System.out.println(set);


        //8.集合的大小
        System.out.println(maps.size());

        //9.合并其他Map集合
        maps.putAll(maps01);

        System.out.println("-------------隔断  遍历-------------");

        //10.遍历Map

        // 10.1 拿到集合所有的键
        for (String s : set) {
            int val = maps.get(s);
            System.out.println(val);
        }
        //10.2 foreach 方法边
        //maps.forEach(leys: empty);
    }


}
