package com.zhisheng._01_HomeWork;
/*
    需求:
        编写一个 Java 程序，定义三个变量，分别表示手机的价格（double 类型）、颜色（String 类型）和版本（int 类型），并将这些信息输出到控制台。
 */
public class Test01 {
    public static void main(String[] args) {
        double price = 998.88;
        String color = "red";
        int version = 1;
        //System.out.println("手机价格是:"+price);
        System.out.print("手机价格是:");
        System.out.println(price);
        System.out.println(color);
        System.out.println(version);
    }
}
