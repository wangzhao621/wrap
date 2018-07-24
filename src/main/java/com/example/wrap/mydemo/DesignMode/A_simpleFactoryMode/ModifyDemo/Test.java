package com.example.wrap.mydemo.DesignMode.A_simpleFactoryMode.ModifyDemo;

import java.util.Scanner;

/**
 * 简单工厂模式：
 * 只需要输入运算符符号，工厂就实例化出合适的对象
 */
public class Test {
    public double operateResult(double number1,double number2,String operator){
        switch (operator){
            case "+" : AddOperate add = new AddOperate();
                       return add.operate(number1,number2);
        }

        return 0;
    }

    public static void main(String[] args){
        Test test = new Test();

        System.out.println("请输入第一个数字");
        Scanner sca1 = new Scanner(System.in);
        double number1 = sca1.nextDouble();
        System.out.println("请输入运算符号(包含+,-,*,/)");
        Scanner s = new Scanner(System.in);
        String operate = s.next();
        System.out.println("请输入第二个数字");
        Scanner sca2 = new Scanner(System.in);
        double number2 = sca2.nextDouble();

        System.out.println("输出的结果为："+test.operateResult(number1,number2,operate));
    }
}
