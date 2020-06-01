package com.peter.struct;

/**
 * @author chen hao
 * @date 2020/5/30 14:10
 */

public class ForDemo01 {
    public static void main(String[] args) {
        int a = 1;

        while (a <= 100) {
            a += 2;
            System.out.println(a);
        }
        /*
        关于for的几点说明：

        最先执行初始化步骤，可以声明一种类型，但可初始化一个或多个变量，也可以是空语句。
        然后，检测布尔表达式的值。如果为true，循环体则被执行。如果为false，循环终止，开始执行循环体后面的语句。
        执行一次循环后，更新循环控制变量（迭代因子控制循环变量的增减）。
        再次检测布尔表达式，循环执行上面的过程。
         */
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }

        for (; a < 103; a++) {
            System.out.println("hello");

        }
    }
}
