package com.peter.Collection;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chen hao
 * @date 2020/6/8 22:45
 */

public class ListDemo01 {
    public static void main(String[] args) {
        List<String> lists = null;
        lists = new ArrayList<String>();
        lists.add("A");
        lists.add("b");
        lists.add("b");
        for (int i = 0; i < lists.size(); i++) {
            System.out.print(lists.get(i)+"\t");
        }

        lists.remove(0);
        System.out.println();

        for (int i = 0; i < lists.size(); i++) {
            System.out.print(lists.get(i)+"\t");
        }
        System.out.println();
        System.out.println(lists.isEmpty());

        System.out.println(lists.contains("b"));

        System.out.println(lists.indexOf("A"));


    }
}
