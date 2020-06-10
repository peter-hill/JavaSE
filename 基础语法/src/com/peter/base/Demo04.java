package com.peter.base;

/**
 * @author chen hao
 * @date 2020/5/22 23:03
 */

public class Demo04 {
    public static void main(String[] args) {
        /*
        位运算
        A = 0011 1100
        B = 0000 1101

        A&B = 0000 1100
        A|B = 0011 1101
        A^B = 0011 0001
        ~B = 1111 0010

        2*8 = 16  2*2*2*2
        位运算效率高！
        <<
        >>
        0000 0010
        0001 0000
        0000 0000
         */
        System.out.println(2<<3);
        System.out.println(13>>1);
        System.out.println(16&13);
    }
}
