package com.peter.struct;

/**
 * @author chen hao
 * @date 2020/6/2 21:09
 */

public class ForDemo05 {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,8};
//        numbers = new int[]{1, 2, 3, 4, 5};

        // jdk 5新增(增强for循环)
        for (int a:numbers) {
            System.out.println(a);
        }

        for (int i = 0; i < 8; i++) {
            System.out.print(numbers[i]+"\t");
        }
    }
}
