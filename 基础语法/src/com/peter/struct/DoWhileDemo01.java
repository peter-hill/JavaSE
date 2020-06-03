package com.peter.struct;

/**
 * @author chen hao
 * @date 2020/5/30 13:48
 */

public class DoWhileDemo01 {
    public static void main(String[] args) {
        int i=0, sum=0;

        do {
            i++;
            sum += i;

        } while (i < 100);

        System.out.println(sum);
    }
}
