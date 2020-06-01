package com.peter.struct;

/**
 * @author chen hao
 * @date 2020/5/29 20:31
 */

public class WhileDemo01 {
    public static void main(String[] args) {
        int i = 2, sum = 0, a = 0;

//        while (i <= 100) {
//            sum +=i;
//            i++;
//            System.out.println(i);
//        }
//        System.out.println(sum);
        int x = i + sum++;
        int y = i + ++a;
//        ++sum;
        System.out.println(x+"\n"+y);
        System.out.println(sum);
    }
}
