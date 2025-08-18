package com.zhisheng._05_赋值运算符;

/*
    练习赋值运算符
 */
public class Test05 {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        a += b;
        System.out.println("a=" + a);
        System.out.println("b=" + b);

        byte c = 127;
        byte d = 3;
        c += d; // 由于java规定,byte类型的变量,进行运算的时候,会优先变成 int类型,然后才参与运算,因此 把 c,d变成int,相加后可以得到int类型的结果 130,由于+=运算符会进一步把最终的结果,转回 变量本身的类型,因此会再次把int类型的 130转成 byte类型,得到结果 -126;
        System.out.println(c);
        System.out.println((byte) 130);
//        System.out.println("1"+=1);// 语法错误,原因是 "1"是常量,+=运算符最后,会把 运算的字符串 "11"进行赋值,而常量 "1"是无法被赋值的,因此报错
//
        String s = "1";
        s += 1;
        System.out.println(s);
    }
}
