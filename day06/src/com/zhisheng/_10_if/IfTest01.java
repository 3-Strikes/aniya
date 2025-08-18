package com.zhisheng._10_if;
/*
    需求:
        新手机价格 7988,旧手机直接卖,可以卖1500,如果不卖,以旧换新可以让新手机打8折,问哪种方案更省钱;
 */
public class IfTest01 {
    public static void main(String[] args) {
        // 方案1 需要花的钱
        int newPhonePrice = 7988;
        int oldPhonePrice = 1500;
        double zk = 0.8;
        int res1 = newPhonePrice - oldPhonePrice;
        // 方案2 需要花的钱
        double res2 = newPhonePrice * zk;
        // 判断哪个数字更小
        //String res = res1 < res2 ? "方案1更省钱,需要花费:"+res1+"元钱即可" : (res1 > res2 ? "方案2更省钱,需要花费:"+res2+"元钱即可":"两种方案花钱一样的,都是:"+res1);
//        System.out.println(res);
        if(res1 < res2){
            System.out.println("方案1更省钱,需要花费:"+res1+"元钱即可");
        }else {
            if(res1 > res2){
                System.out.println("方案2更省钱,需要花费:"+res2+"元钱即可");
            }else {
                System.out.println("两种方案花钱一样的,都是:"+res1);
            }
        }

    }
}
