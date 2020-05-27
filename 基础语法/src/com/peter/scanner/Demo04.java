package com.peter.scanner;

import java.util.Scanner;

/**
 * @author chen hao
 * @date 2020/5/27 21:22
 */

public class Demo04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = 0;
        int m = 0;

        while (scanner.hasNextDouble()){
            double x = scanner.nextDouble();
            m++;
            sum+=x;
        }
        System.out.println(m+"个数和为"+sum);
        System.out.println(m+"个数的平均值为"+sum/m);

        scanner.close();
    }
}
