package com.peter.base;

/**
 * @author chen hao
 * @date 2020/5/25 20:11
 */

public class Demo07 {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        int a = 0;
        int b = 1;

        try {
            System.out.println(b/a);
        } catch (Throwable e) {
            System.out.println("2323");
            e.printStackTrace();
        } finally {
            System.out.println("finally");
        }
    }
}
