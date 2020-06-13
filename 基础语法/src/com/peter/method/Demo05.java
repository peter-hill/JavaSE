package com.peter.method;

/**
 * @author chen hao
 * @date 2020/6/13 20:16
 */

public class Demo05 {
    public static void main(String[] args) {
        Demo05 demo05 = new Demo05();

        demo05.test(1, 2, 3, 6, 765);
    }

    public void test(int... i) {
        for (int i1 = 0; i1 < i.length; i1++) {
            System.out.print(i[i1] + "\t");
        }
    }
}
