package com.peter.scanner;

import java.util.Scanner;

/**
 * @author chen hao
 * @date 2020/5/27 20:52
 */

public class Demo02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        System.out.println("sdasfas:"+str);
        scanner.close();
    }
}
