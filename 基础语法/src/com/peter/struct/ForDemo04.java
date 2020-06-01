package com.peter.struct;

/**
 * @author chen hao
 * @date 2020/5/31 14:50
 */

public class ForDemo04 {
    public static void main(String[] args) {
        for (int i = 0; i <= 1000; i++) {

            if (i%5==0) {
                System.out.print(i+"\t");
            }
            //如果用else if第一个成立就直接跳出了，第一个不成立第二个也不成立，所以不会跳到
//            第二个，但如果用if的话属于两个if快拼接城的顺序
            if (i%15==0) {
                System.out.println();
//                System.out.println("\n");
            }
        }
    }
}
