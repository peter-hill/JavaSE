package com.peter.array;

import java.util.Arrays;

import static com.peter.array.ArrayDemo03.printArray;

/**
 * @Author ChenHao
 * @Date 2020/7/29
 */
public class ArrayDemo05 {
    public static void main(String[] args) {
        int[][] array = {{1,2},{2,3},{4,5}};
        printArray(array[0]);
        for (int[] ints : array) {
//            printArray(ints);
        }
    }

}
