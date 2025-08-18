package com.zhisheng._04_字符串拼接;
/*
    练习字符串拼接

    使用两个变量,拼接出一个等式

 */
public class Test04 {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        // 拼接出的效果   2+3=5
        String res = a+"+"+b+"="+(a+b) ;
        System.out.println(res);
    }
}
