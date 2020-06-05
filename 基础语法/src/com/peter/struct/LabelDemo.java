package com.peter.struct;

/**
 * @author chen hao
 * @date 2020/6/4 19:45
 */

public class LabelDemo {
    public static void main(String[] args) {
        int count = 0;

        outer:for (int i = 101; i < 150; i++) {
            for (int j = 2; j < i/2; j++){
                if (i%j==0){
                    continue outer;
                }
            }
            System.out.println(i);
            
        }
    }
}
