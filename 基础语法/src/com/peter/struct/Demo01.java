package com.peter.struct;

import java.util.Scanner;

/**
 * @author chen hao
 * @date 2020/5/28 20:41
 */

public class Demo01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("please enter");
//        scanner.has
        String s = scanner.nextLine();
        if("hello".equals(s)){
            System.out.println(s);
        }
        System.out.println("end");
        scanner.close();
    }
}
