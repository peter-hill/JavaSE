package com.peter.scanner;

import com.sun.javafx.geom.transform.Identity;
import com.sun.xml.internal.bind.v2.model.core.ID;

import java.util.Scanner;

/**
 * @author chen hao
 * @date 2020/5/26 20:50
 */

public class Demo01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("使用next方式就收：");
        //判断用户有没有输入,hasnext以有效字符开始，空格结束，不能带有空格的字符串
        if (scanner.hasNext()) {
            //使用对象的next方法接收输入的参数
            String str = scanner.next();
            System.out.println("用户输入的数据为："+str);
        }else{
            System.out.println("233");
        }

//        scanner.close();
        // hasNextLine以回车作为结束符，回车之前的都作为有效字符
        Scanner scanner1 = new Scanner(System.in);
        if (scanner1.hasNextLine()) {
            String str1 = scanner1.nextLine();
            System.out.println("用户输入为"+str1);
        }

        scanner.close();
    }
}
