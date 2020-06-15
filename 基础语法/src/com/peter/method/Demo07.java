package com.peter.method;

/**
 * @author chen hao
 * @date 2020/6/14 17:01
 */

public class Demo07 {
    public static void main(String[] args) {
        Demo07 demo07 = new Demo07();
        System.out.println(demo07.f(20));
    }

    public long f (int n) {
        if (n == 1) {
            return 1;
        } else {
            return n*f(n-1);
        }
    }
}
