package com.peter.base;

/**
 * @author chen hao
 * @date 2020/5/22 23:35
 */

public class Demo06 {
    public static void main(String[] args) {
        // x ? y : z

        System.out.println("如果结果x(可以为表达式)为true，结果为y，否则为z");

        int score = 59;

        String R = score < 60 ? "不及格":"及格";
        System.out.println();
        System.out.println(R);
    }
}
//公司域名倒置作为包名