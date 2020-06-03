package com.peter.struct;

import java.util.Scanner;

/**
 * @author chen hao
 * @date 2020/5/28 21:25
 */

public class Demo02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入成绩：");

//        if (scanner.hasNextDouble()){
//            double i = scanner.nextDouble();
//            if (i >= 60.0) {
//                System.out.println("及格");
//            } else {
//                System.out.println("不及格");
//            }
//        }else{
//            System.out.println("类型输入错误");
//        }
        while (scanner.hasNextDouble()){
            double score = scanner.nextDouble();

            if (score >= 60.00 && score < 80.00) {
                System.out.println("及格");
            } else if (score >= 80.00 && score < 90.00){
                System.out.println("良好");
            } else if (score >= 90.00 && score <= 100.00){
                System.out.println("优秀");
            } else if (score > 100.00 || score < 0.00){
                System.out.println("输入有误！！！");
            } else {
                System.out.println("不及格");
            }
        }
//        if () {
//            int i = 0;
//        } else {
//            if (){
//
//            }else{
//
//            }
//        }

        scanner.close();
    }
}
