package com.example.wrap.mydemo.DesignMode.A_simpleFactoryMode;

import java.util.Scanner;

/**
 * 实现计算器控制台服务
 * 要求：输入两个数和运算符号
 */
public class Demo1 {

    //计算方法
    public double calculate(double number1,double number2,String operator){
        switch (operator){
            case "+" : return number1+number2;
            case "-" : return number1-number2;
            case "*" : return number1*number2;
            case "/" :
                if(number2 == 0){
                    return 0;
                }else{
                    return number1/number2;
                }
        }
        return 0;
    }

    public static void main(String[] args){
        Demo1 demo1 = new Demo1();
        System.out.println("请输入第一个数字");
        Scanner sca1 = new Scanner(System.in);
        double number1 = sca1.nextDouble();
        System.out.println("请输入运算符号(包含+,-,*,/)");
        Scanner s = new Scanner(System.in);
        String operate = s.next();
        System.out.println("请输入第二个数字");
        Scanner sca2 = new Scanner(System.in);
        double number2 = sca2.nextDouble();
        double result = demo1.calculate(number1,number2,operate);

        System.out.println("计算结果为："+result);
    }
}
