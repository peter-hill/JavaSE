package com.peter.array;

/**
 * @author chen hao
 * @date 2020/6/8 16:51
 */

public class ArrayDemo01 {
    public static void main(String[] args) {
        Array array = new Array(1000);
        array.insert("hello");
        array.insert("world");
        array.insertPro("love", 3);
        System.out.println(array.contains("hello"));
        array.display();
    }
}
