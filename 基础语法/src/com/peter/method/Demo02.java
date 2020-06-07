package com.peter.method;

/**
 * @author chen hao
 * @date 2020/6/7 15:27
 */

public class Demo02 {
    public static void main(String[] args) {
        int result = max(20, 20);
        System.out.println(result);
    }

    public static int max(int a, int b) {
        int result = 0;

        if (a > b) {
            return a;
        }else if (a < b) {
            return b;
        } else {
            System.out.println("equals");
            return 0;
        }
    }
}
