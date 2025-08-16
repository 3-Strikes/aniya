package com.zhisheng._09_自增自减运算符;
/*
    练习自增自减运算符
 */
public class Test09 {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        // 单独使用
        a++; // 自身加1
        ++a; // 自身加1
        System.out.println("a="+a);
        // 复合使用
        System.out.println(b--);//  先输出b原来的值,输出后,b才会进行自身的运算 (-1)  6
        System.out.println(--b);//  b会先减一,然后才输出   4

        int c = b--; // 4
        int d = --b; // 2
        System.out.println("c="+c);//     4
        System.out.println("d="+d);//  2

        System.out.println("b="+b);
        // 当同一个变量,在一个表达式中多次参与运算的时候,从左往右,逐块运算,每块算完之后,再算其他运算符
        int e = b++ + ++b + b++ * ++b;
        System.out.println("e="+e); // 30

        a = a++; // 没有意义,a不变
        System.out.println(a);
    }
}
