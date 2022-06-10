package com.mitu.Arrys;


import java.util.Arrays;
import java.util.Comparator;

public class ArrysDemo002 {
    public static void main(String[] args) {
        Integer[] arr = {23,12,561,123,5326,122,123,40};

        System.out.println(Arrays.toString(arr));
        //自定义数组排序规则 Comparator比较器对象
        //基本使用方法：
//        Arrays.sort(arr, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                //默认相当于  o1-o2  即 升序
//                //return o1-o2;
//                return o2-o1; //降序
//            }
//        });
        Arrays.sort(arr, (o1, o2) ->  (o2-o1) );//降序
        System.out.println(Arrays.toString(arr));
        System.out.println("---------------------");

        Student[] stu = new Student[3];
        stu[0] = new Student("张三",14, 169.1);
        stu[1] = new Student("李青",18, 165.4);
        stu[2] = new Student("奥巴马",17, 173.6);
        Arrays.sort(stu, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Double.compare(o1.height, o2.height);
            }
        });

        System.out.println(Arrays.toString(stu));
    }
}
