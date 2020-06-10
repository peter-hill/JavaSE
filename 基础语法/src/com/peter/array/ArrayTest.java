package com.peter.array;

/**
 * @author chen hao
 * @date 2020/6/8 16:51
 */

public class ArrayTest {
    public static void main(String[] args) {
        Array array = new Array(100);
        array.insert("hello");
        array.insert("world");
        array.insertPro("love", 1);
        array.insert("what");
        array.insertPro("peter", 3);
        array.delete("hello");
//        System.out.println(array.contains("hello"));
        array.display();
        array.length();
    }
}
