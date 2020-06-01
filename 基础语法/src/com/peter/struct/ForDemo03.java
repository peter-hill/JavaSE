package com.peter.struct;

/**
 * @author chen hao
 * @date 2020/5/31 12:03
 */

public class ForDemo03 {
    public static void main(String[] args) {

        for (int i = 1; i < 10; i++) {

            for (int j = 1; j < 10; j++) {
                if(i==j&&i!=1){
                    System.out.println(i+"*"+j+"="+i*j+" ");
                } else {
                    System.out.print(i+"*"+j+"="+i*j+" ");
                }

            }
        }
    }
}
