package com.peter.struct;

/**
 * @author chen hao
 * @date 2020/6/2 21:09
 */

public class ForDemo05 {
    public static void main(String[] args) {
        int[] numbers;
        numbers = new int[]{1, 2, 3, 4, 5};

        // jdk 5新增
        for (int a:numbers) {
            System.out.println(a);
        }
    }
}
