package com.mitu.File;

import java.io.File;

/**
 * 文件使用详情
 */
public class FileIndex {
    public static void main(String[] args) {
        File f1 = new File("G:\\1.txt") ;
        System.out.println(f1.getAbsolutePath());
        System.out.println("f1 = " + f1);
    }
}
