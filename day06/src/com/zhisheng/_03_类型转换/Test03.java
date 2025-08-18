package com.zhisheng._03_类型转换;

import java.sql.SQLOutput;

/*
    练习自动类型转换(隐式类型转换)和强制类型转换
 */
public class Test03 {
    public static void main(String[] args) {
        byte a = 22;
        int b = a; // 隐式类型转换, 把 byte类型的变量a记录的值赋值给了int类型的变量b
        byte c = (byte) b; // 强制类型转换,需要在数据的前面,通过小括号写上要转成的类型
        System.out.println(b);
        System.out.println(c);

        char myChar = 'a';
        short r = (short) myChar;// char转 byte或short需要强转
        System.out.println(r);
        byte d = 65;
        char e = (char) d; // byte或short转char也需要强转
        System.out.println(e);

        char f = '你'; // 本质上对应的是一个数字,因此可以进行 算术运算
        System.out.println(+f); // 此时 的 + 代表的是一个 正号,会自动把变量f变为 int类型
    }
}
