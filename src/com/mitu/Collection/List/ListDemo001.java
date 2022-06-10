package com.mitu.Collection.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListDemo001 {
    public static void main(String[] args) {
        List<String> li = new ArrayList<>();


        LinkedList<String> list = new LinkedList<>();
        list.addFirst("第一个");
        list.addFirst("第二个");
        list.addFirst("第三个");
        list.addFirst("第四个");
        list.push("第四个"); //和addFirst()一样
        list.push("第五个");
        list.addLast("第六个");

        System.out.println(list);
//        System.out.println(list.removeFirst()); //还有removeLast()
//        System.out.println(list.removeFirst());
//        System.out.println(list.removeFirst());
//        System.out.println(list.removeFirst());
        System.out.println(list);

        //删除特定元素
        for (int i = list.size()-1; i >=0; i--) {
            String s = list.get(i);
            System.out.println(s);
            if (s.equals("第四个"));
                list.remove("第四个");
        }
        System.out.println(list);

    }
}
