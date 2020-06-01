package com.peter.struct;

/**
 * @author chen hao
 * @date 2020/5/30 13:54
 */

public class DoWhileDemo02 {

    public static void main(String[] args) {
        int x = 0;
        while(x < 1){
            System.out.println(x);
            x++;
        }

        do {
            System.out.println("doWhile"+"\\"+x);
            x++;
        } while (x < 0);
    }

}
