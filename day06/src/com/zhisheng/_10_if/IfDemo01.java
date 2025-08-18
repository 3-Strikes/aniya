package com.zhisheng._10_if;
/*
    练习if语句的第1种格式

    适用的场景:
    做与不做的选择

 */
public class IfDemo01 {
    public static void main(String[] args) {
        boolean isVip = false;
        //if(isVip == true){
        if(isVip){ // 当变量是 布尔类型的时候,可以直接作为 if语句的值使用,如果不是布尔类型的时候,通常需要配合 关系运算符
            System.out.println("可以积分...");
        }
        System.out.println("结账了....");
    }
}
