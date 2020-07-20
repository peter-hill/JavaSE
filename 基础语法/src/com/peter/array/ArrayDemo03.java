package com.peter.array;


/**
 * @author chen hao
 * @date 2020/7/10 15:09
 */

public class ArrayDemo03 {
    public static void main(String[] args) {
        int[] arrays = {1,2,3,4,5,6,7};

        for (int array : arrays) {
            System.out.println(array);
        }

        printArray(arrays);
    }

    public static void printArray(int[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
    }

}

