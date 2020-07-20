package com.peter.array;

/**
 * @author chen hao
 * @date 2020/6/24 10:35
 */

public class ArrayDemo01 {
    public static void main(String[] args) {
        int[] nums;
        int nums1[];// C 和 C++的习惯

        nums = new int[10];

        for (int x:nums) {
            System.out.println(x);
        }

//        System.out.println(nums[10]);


        /*
        三种初始化
        1.静态初始化(创建+赋值)，一旦创建就不可改变，在程序运行时声明和创建
        2.动态初始化(后期赋值，包含默认初始化)在运行时声明，编译时创建
        3.
         */

        int[] nums2 = {1,2,3,4,5};
        System.out.println(nums2[0]);

        int[] nums3 = new int[10];

    }
}
