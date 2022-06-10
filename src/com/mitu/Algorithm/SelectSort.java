package com.mitu.Algorithm;

import java.util.Arrays;

public class SelectSort {
    public static void main(String[] args) {
        int[] arr001 = {3, 5, 1, 6, 8, 3, 9, 2, 14, 51, 34};
        System.out.println(Arrays.toString(arr001));

        //选择排序
        long time01 = System.currentTimeMillis();
        for (int i = 0; i < arr001.length - 1; i++) {
            int temp;
            for (int j = i + 1; j < arr001.length; j++) {
                if (arr001[j] < arr001[i]) {
                    temp = arr001[j];
                    arr001[j] = arr001[i];
                    arr001[i] = temp;
                }
            }

        }
        long time02 = System.currentTimeMillis();
        System.out.println(Arrays.toString(arr001));
        System.out.println(time01 - time02);


        int index = search(arr001, 34);
        System.out.println(index);

    }

    /**
     * 二分查找
     *
     * @param arr  数组
     * @param data 查找的值
     * @return 索引
     */
    public static int search(int[] arr, int data) {
        int min = 0;
        int max = arr.length - 1;
        while (min <= max) {
            int mid = (min + max) / 2;
            if (data < arr[mid]) max = mid - 1;
            else if (data > arr[mid]) min = mid + 1;
            else return mid;
        }
        return -1;
    }
}
