package com.peter.array;

/**
 * @author chen hao
 * @date 2020/6/9 14:45
 */

public class OrderArray {
    private int [] intArray;
    private int length = 0;

    /**
     * 构造方法，传入数组最大长度
     */
    public OrderArray (int max) {
        intArray = new int [max];
    }

    /**
     * 用二分查找法查找某一个元素，如果存在则返回其下标，不存在则返回-1
     * @param target
     * @return
     */
    public int find(int target) {
        // 搜索段最小元素的下标
        int lowerBound = 0;
        // 搜索段最大元素的下标
        int upperBound = length-1;
        // 当前检测元素的下标
        int curIn;

        // 数组为空，返回-1（当不存在元素时，length = 0，upperBound == -1）
        if (upperBound < 0 || lowerBound > upperBound || target < intArray[lowerBound] || target > intArray[upperBound]) {
            return -1;
        }

        while (lowerBound <= upperBound) {
            curIn = (lowerBound + upperBound) / 2;
            if (target < intArray[curIn]) {
                upperBound = curIn-1;
            }else if (target > intArray[curIn]) {
                lowerBound = curIn+1;
            }else {
                System.out.println(curIn);
                return curIn;
            }
        }
        return -1;
    }

    /**
     * 插入
     * @param elem
     */
    public void insert (int elem) {
        int location = 0;
        // 判断应插入位置的下标
        for (; location < length; location++) {
            if (intArray[location] > elem) {
                break;
            }
        }
        // 插入下标后所有元素都后移一位
        for (int i = length; location < i; i--) {
            intArray[i] = intArray[i-1];
        }
        length++;
        intArray[location] = elem;

    }

    /**
     * 删除某个指定元素的值，成功返回true，失败返回false
     * @param target
     * @return
     */
    public boolean delete (int target) {
        int index = -1;
        if ((index = find(target)) != -1) {
            for (int i = index; i < length; i++) {
                intArray[i] = intArray[i + 1];
            }
            length--;
            return true;
        }else {
            return false;
        }
    }

    /**
     * 列出所有元素
     */
    public void display() {
        for (int i = 0; i < length; i++) {
            System.out.print(intArray[i] + "\t");
        }
        System.out.println();
    }

    /**
     * 打印长度
     */
    public void length () {
        System.out.println(length);
    }

}
