package com.peter.method;

/**
 * @author chen hao
 * @date 2020/6/7 14:33
 */

public class Demo01 {
    // main 放法
    public static void main(String[] args) {
        int a = 100;
        int sum = add(2,5);
        System.out.println(a+" "+sum);
    }

    public static int add(int a, int b) {
        a = 10;
        return a+b;
    }
}
