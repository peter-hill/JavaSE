package com.peter.array;


/**
 * @author chen hao
 * @date 2020/7/10 15:09
 */

public class ArrayDemo03 {
    public static void main(String[] args) {
        int[] arrays = {1, 2, 3, 4, 5, 6, 7};
// jdk1.5以上才有的
//        for (int array : arrays) {
//            System.out.println(array);
//        }
//
//        printArray(arrays);

        printArray(resverse(arrays));
    }

    public static void printArray(int[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
    }

    /**
     * 反转数据
     * @param arrays
     * @return
     */
    public static int[] resverse(int[] arrays) {
        int[] result = new int[arrays.length];

        for (int i = 0; i < arrays.length; i++) {
            result[i] = arrays[arrays.length - 1 - i];
        }
//        printArray(result);
        return result;
    }

}

