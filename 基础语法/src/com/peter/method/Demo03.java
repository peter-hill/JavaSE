package com.peter.method;

/**
 * @author chen hao
 * @date 2020/6/7 17:10
 */

public class Demo03 {
    public static void main(String[] args) {
        int num = 20;
        foo(num);
        System.out.println(num);
    }

    static void foo(int value) {
        value = 100;
    }
}
