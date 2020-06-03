package com.peter.struct;

import java.util.Objects;
import java.util.Scanner;

/**
 * @author chen hao
 * @date 2020/5/29 6:57
 */

public class Demo03 {
    public static void main(String[] args) {
        String exception = null;

        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLine()) {
            exception = scanner.nextLine();
        } else {
            System.out.println("error");
        }
//switch 穿透
        switch (Objects.requireNonNull(exception)){
            case "浩浩":{
                System.out.println(exception.hashCode());
                break;
            }
            case "玮玮":{
                System.out.println("我是大玮");
                break;
            }
            default:{
                System.out.println("error");
            }
        }
        scanner.close();
    }
}
