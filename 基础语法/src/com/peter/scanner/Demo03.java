package com.peter.scanner;

import java.util.Scanner;

/**
 * @author chen hao
 * @date 2020/5/27 21:01
 */

public class Demo03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        float f = 0.0f;

        if(scanner.hasNextInt()){
            i = scanner.nextInt();
            System.out.println(i);
        }else {
            System.out.println("输入有误");
        }

        if(scanner.hasNextFloat()){
            f = scanner.nextFloat();
            System.out.println(i);
        }else {
            System.out.println("输入有误");
        }

        scanner.close();
    }
}
