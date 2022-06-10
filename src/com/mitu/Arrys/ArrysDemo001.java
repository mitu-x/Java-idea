package com.mitu.Arrys;

import java.util.Arrays;

public class ArrysDemo001 {
    public static void main(String[] args) {
        int[] arr = {32,321,121,542,122,12};
        System.out.println(arr);

        //数组输出详细
        System.out.println(Arrays.toString(arr));
        //数组排序   默认升序
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        //二分搜索  需要先排好序  基于 二分法  很好理解
        int index001 = Arrays.binarySearch(arr, 123);
        int index002 = Arrays.binarySearch(arr, 32);
        System.out.println(index001);
        System.out.println(index002);
    }
}
