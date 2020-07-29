package com.peter.array;

/**
 * @Author ChenHao
 * @Date 2020/7/22
 */
public class ArrayDemo04 {
    public static void main(String[] args) {
        int num = 100;

        System.out.println(foo(num));
        System.out.println(num);
    }

    public static int foo(int a) {
        a++;
        return a;
    }



}
