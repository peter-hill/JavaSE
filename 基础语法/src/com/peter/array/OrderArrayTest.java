package com.peter.array;

/**
 * @author chen hao
 * @date 2020/6/9 18:01
 */

public class OrderArrayTest {
    public static void main(String[] args) {
        OrderArray orderArray = new OrderArray(20);
        orderArray.insert(20);
        orderArray.insert(13);
        orderArray.insert(15);
        orderArray.insert(4);
//        orderArray.insert(37);
//        orderArray.insert(54);
//        orderArray.display();
//        orderArray.length();
        orderArray.find(15);
//        orderArray.find(37);
//        orderArray.delete(15);
        orderArray.display();
//        orderArray.length();
    }
}
