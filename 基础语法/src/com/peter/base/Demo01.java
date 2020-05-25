package com.peter.base;

/**
 * @author chen hao
 * @date 2020/5/12 19:44
 */

public class Demo01 {
    public static void main(String[] args) {
        int num = 1;
        byte num01 = 20;
        short num2 = 23;
        long num3 = 203L;
        float num4 = 40.2f;
        double num5 = 3.142322434;

        char name = 'a';
//        String不是关键字，是类
        String name1 = "scd";
        
        boolean flag = true;

        double d = 2.4;
        double e = 2.4 - 2.0;
        System.out.println(e);

        for(int i=0; i<=127; i++){
            System.out.println((char)i+":"+i+'\n');
        }
        System.out.println('\u4e2d');
    }
}
