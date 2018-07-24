package com.example.wrap.mydemo.DesignMode.A_simpleFactoryMode.ModifyDemo;

/**
 * Created by admin on 2018/7/10.
 */
public class AddOperate implements BaseOperator {
    @Override
    public double operate(double number1, double number2) {
        return number1 + number2;
    }
}
