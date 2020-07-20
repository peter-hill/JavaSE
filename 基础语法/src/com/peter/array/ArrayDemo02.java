package com.peter.array;

/**
 * @author chen hao
 * @date 2020/7/10 11:22
 */

public class ArrayDemo02 {
    public static void main(String[] args) {
        int[] arrays = {1,2,3,4,5,6,9,8};

        int max = arrays[0];

        for (int i = 0; i < arrays.length; i++) {
            if (max < arrays[i]){
                max = arrays[i];
            }
        }
        System.out.println(max);
    }
}
