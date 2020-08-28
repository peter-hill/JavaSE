package com.peter.array;

import java.util.Arrays;

/**
 * @author chen hao
 * @date 2020/8/17
 */
public class MaoPaoSort {
    public static void main(String[] args) {
        int[] arrays = {7456, 2341, 234, 55, 45, 23, 6};

        int[] sort = sort(arrays);
        System.out.println(Arrays.toString(sort));
    }

    public static int[] sort(int[] a) {
        int temp;

        for (int i = 0; i < a.length - 1; i++) {
            boolean flag = true;

            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;

                    flag = false;
                }
            }
            if (flag) {
                break;
            }
        }
        return a;
    }
}
