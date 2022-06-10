package com.mitu.VariableParameter;

import java.util.Arrays;

public class ChangeDemo001 {

    public static void main(String[] args) {

        sum();//不传参数
        sum(1, 2);//传多个参数
        sum(new int[]{1, 2, 3, 4, 5, 6});//传数组参数


    }
    /**
     * 可变参数
     * 格式： 参数类型...参数名称
     * 功能： 可传入随机个数参数
     * 特点： 一个形参 只能有一个可变参数   多个参数时   可变参数放到最后面
     */
    public static int sum(int... nums) {
        System.out.println("个数：" + nums.length);
        System.out.println("内容：" + Arrays.toString(nums));
        return 0;
    }
}
