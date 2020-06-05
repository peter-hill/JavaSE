package com.peter.struct;

/**
 * @author chen hao
 * @date 2020/6/4 20:02
 */

public class TestDemo {
    public static void main(String[] args) {
        //打印三角形

        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print(" ");
            }
//            System.out.println();

            for (int x = 1; x <= i; x++){
                System.out.print("&");
            }

            for (int x = 2; x <= i; x++){
                System.out.print("&");
            }
            for (int j = 5; j >= i; j--) {
                System.out.print(" ");
            }
            System.out.println();
            
        }
    }
}
