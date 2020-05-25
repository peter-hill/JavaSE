package com.peter.base;

/**
 * @author chen hao
 * @date 2020/5/22 23:29
 */

public class Demo05 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        //输出时数字运算前方存在字符串类型，输出总值会变成字符串拼接
        System.out.println(""+a+b);
        System.out.println(a + b + "");
    }
}
