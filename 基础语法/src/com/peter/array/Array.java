package com.peter.array;

/**
 * @author chen hao
 * @date 2020/6/8 16:51
 */

public class Array {
    private String [] strArray;
    private int length = 0;

    /**
     * 构造方法，传入数组最大长度
     */

    public Array(int max) {
        strArray = new String [max];
    }

    /**
     * 检查数组中是否包含某个元素，是则返回下标，否则返回-1
     */
    public int contains (String target) {
        int index = -1;
        for (int i = 0; i < length; i++) {
            if (strArray[i].equals(target)) {
                index = i;
                break;
            }
        }
        return index;
    }

    /**
     * 插入
     */
    public void insert(String elem) {
        strArray[length] = elem;
        length++;
    }

    /**
     * 在指定位置前插入元素
     */
    public void insertPro (String elem, int location) {
        if (location > length-1){
            System.out.println("不能大于数组最后一个元素的下标值");
        } else if (location < 0) {
            System.out.println("位置不能小于0");
        } else {
            for (int i = location; i < length; i++) {
                strArray[location+1] = strArray[location];
            }
            length++;
            strArray[location] = elem;
        }
    }

    /**
     * 删除某个指定元素的值，成功则返回true，否则返回false
     */
    public Boolean delete (String target) {
        int index = -1;
        if ((index = contains(target))!= -1) {
            for (int i = index; i < length - 1; i++) {
                strArray[i] = strArray[i+1];
            }
            length--;
            return true;
        }else {
            return false;
        }
    }

    /**
     * 打印数组中元素
     */
    public void display () {
        for (int i = 0; i < length; i++) {
            System.out.print(strArray[i] + "\t");
        }
    }

    /**
     * 计算数组长度
     */
    public void length () {
        System.out.println(length);
    }
}
