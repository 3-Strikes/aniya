package com.zhisheng._08_三元运算符;
/*
    练习三元运算符
 */
public class Test08 {
    public static void main(String[] args) {
        double a = -13.3,b=-4.4;
        // 求 a和b中的较大者
        double c = a>b?a:b; // 三元运算符的结果赋值给了变量c
        System.out.println("c="+c);
        System.out.println(a>b?a:b);// 三元运算符的结果直接输出
        double d = (a>b?a:b)*2; // 三元运算符的结果,参与其他运算
        System.out.println("d="+d);

    }
}
