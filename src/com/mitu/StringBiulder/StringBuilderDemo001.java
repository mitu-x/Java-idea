package com.mitu.StringBiulder;

/**
 * StringBuilder操作字符串
 * 性能优于String
 */
public class StringBuilderDemo001 {
    public static void main(String[] args) {
        StringBuilder str001 = new StringBuilder();
        str001.append('a').append(1).append("mitu");
        System.out.println(str001);
    }
}
