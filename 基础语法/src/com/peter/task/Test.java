package com.peter.task;

/**
 * @author chen hao
 * @date 2020/6/17 8:33
 */

public class Test{
    public static void main (String [] args){
        int result = 0;
        final char ADD = '+';
        final char SUB = '-';
        final char MULTI = 'x';
        final char DIV = '/';
        final char MOD = '%';
        if (args.length != 3){
            System.out.println("Usage: java Calc operator1 operand(+ - * / %) operator2");
        }
        else {
            switch (args[1].toCharArray()[0]){
                case ADD:
                    result = Integer.parseInt(args[0]) + Integer.parseInt(args[2]);
                    break;
                case SUB:
                    result = Integer.parseInt(args[0]) - Integer.parseInt(args[2]);
                    break;
                case MULTI:
                    result = Integer.parseInt(args[0]) * Integer.parseInt(args[2]);
                    break;
                case DIV:
                    result = Integer.parseInt(args[0]) / Integer.parseInt(args[2]);
                    break;
                case MOD:
                    result = Integer.parseInt(args[0]) % Integer.parseInt(args[2]);
                    break;
                default:
                    System.out.println("Usage: java Calc operato1 operand(+ - x / %) operator2");
                    break;
            }
        }
        System.out.println(args[0] + " " + args[1] + " " + args[2] + " = " + result);
    }
}
