package com.peter.struct;

/**
 * @author chen hao
 * @date 2020/5/31 12:03
 */

public class ForDemo03 {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(j+"*"+i+"="+i*j+"\t");
                if(i == j){
                    System.out.println();
                }
            }
        }

        for (int a = 1; a < 10; a++) {

            for (int b = 1; b <= 9; b++) {
                System.out.print(b+"*"+a+"="+a*b+"\t");
//                if(a == b){
//                    System.out.println();
//                }
            }
            System.out.println();
        }
    }
}
