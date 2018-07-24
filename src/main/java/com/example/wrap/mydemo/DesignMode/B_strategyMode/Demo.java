package com.example.wrap.mydemo.DesignMode.B_strategyMode;

/**
 * 商场收银软件
 * 根据商品的单价和数量，收取费用
 */
public class Demo {

    /**
     * @param singlePrice---单价
     * @param num---数量
     */
    public double price(double singlePrice,int num){
        return singlePrice * num;
    }

    public static void main(String[] args){
        Demo demo = new Demo();
        System.out.println("请输入单价和数量");
        double singlePrice = 10;
        int num = 5;
        double result = demo.price(singlePrice , num);
        System.out.print("输出最后价格为:"+result);
    }

    /**
     * 欠考虑的问题：
     * 只能解决目前需求
     * 1.如果商场打折，需要修改原先算法
     * 2.如果商场增加返利活动(满减)，需要重新增加算法
     * 3.如果商场增加积分活动，也需要重新增加算法
     *
     *
     * 综上所述：
     * 1.商场的活动会频繁变动，因此需要抽象出接口，应对商场的活动
     * 2.使用简单工厂，创建各个实现类，实现商场的各个活动（若新增活动，则新增实现类，降低耦合度）
     * 3.客户端选择优惠类型后，将各个算法的实例抽出一个类（switch case）
     */
}


/**
 * 策略模式：用来封装算法的模式
 * 在分析过程中，需要在不同时间应用不同的业务规则，可以考虑用策略模式
 */