package com.peter.struct;

/**
 * @author chen hao
 * @date 2020/6/3 19:56
 */

// break在循环中强行退出循环，不执行循环中剩余的语句（也在switch中使用）
// continue终止某次循环，跳过尚未执行的语句，进行下一次是否执行循环的判定

public class BreakContinueDemo {
    public static void main(String[] args) {
        int i = 0;
        while (i<100){
            i++;
            if (i==30) {
                break;
            }else if (i==20){
                continue;
            }
            System.out.println(i);
        }
        System.out.println("i love" +
                "you");
    }
}
