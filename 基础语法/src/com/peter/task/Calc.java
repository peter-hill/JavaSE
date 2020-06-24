package com.peter.task;

import com.sun.org.apache.bcel.internal.generic.SWITCH;

import java.util.Scanner;

/**
 * @author chen hao
 * @date 2020/6/16 8:55
 */

public class Calc {

    /**
     * 加法
     * @param a
     * @param b
     * @return
     */
    public double add (double a, double b) {
        return a + b;
    }

    /**
     * 减法
     * @param a
     * @param b
     * @return
     */
    public double subtract (double a, double b) {
        return a - b;
    }

    /**
     * 乘法
     * @param a
     * @param b
     * @return
     */
    public double multiply (double a, double b) {
        return a * b;
    }

    /**
     * 除法
     * @param a
     * @param b
     * @return
     */
    public double divide (double a, double b) {
        return a / b;
    }

    public void calc () {
        String flag = "continue";
        while (flag == "continue") {

            System.out.println("请输入第一个需计算的数");
            Scanner a = new Scanner(System.in);
            int x = a.nextInt();
            a.close();

            System.out.println("请输入第二个需计算的数");
            Scanner b = new Scanner(System.in);
            int y = b.nextInt();
            b.close();

            System.out.println("请输入运算符");
            Scanner o = new Scanner(System.in);
//            if (o.hasNextLine()){
//
//            }else {
//                String operator = "+";
//            }
            String operator = o.nextLine();

            o.close();

            // 输入1表示退出，0表示继续
            System.out.println("是否结束，输入1，结束计算，输入其他整数，继续计算：");
            Scanner e = new Scanner(System.in);
            int f = e.nextInt();
            e.close();
            if (f == 1) {
                flag = "end";
            } else {
                System.out.println("将继续运算");
            }

            switch (operator) {
                case "+":
                    add(x, y);
                    break;
                case "-":
                    subtract(x, y);
                    break;
                case "*":
                    multiply(x, y);
                    break;
                case "/":
                    divide(x, y);
                    break;
                default:
                    System.out.println("选择有误！");
            }


        }
    }

    public Double[] scan (double a, double b) {
        Double [] doubles = new Double[2];
        doubles[0] = a;
        doubles[1] = b;
        return doubles;
    }
}
