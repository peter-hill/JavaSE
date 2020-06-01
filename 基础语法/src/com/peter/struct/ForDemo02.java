package com.peter.struct;

/**
 * @author chen hao
 * @date 2020/5/30 20:23
 */

public class ForDemo02 {
    public static void main(String[] args) {
        //打印0~100之间的奇数和偶数的和
        int sum = 0;
        for (int i = 0; i <= 100; i+=2) {
            sum+=i;
//            System.out.println(i);
        }
        System.out.println(sum);

        int sum1 = 0;

        for (int j = 1; j < 100; j+=2) {
            sum1 += j;
        }
        System.out.println(sum1);



        int ji = 0, ou = 0;


        //狂神写法
        for (int i = 0; i <= 100; i++) {
            if(i%2!=0){
                ji+=i;
            }else {
                ou+=i;
            }
        }
        System.out.println("奇数之和"+ji);

        System.out.println("偶数之和"+ou);

    }
}
