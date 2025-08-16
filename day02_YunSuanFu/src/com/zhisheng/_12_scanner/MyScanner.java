package com.zhisheng._12_scanner;

import java.util.Scanner;

/*
    键盘输入的技术

    允许程序员在代码运行的时候,再给变量赋值,而不是写代码的时候,就把变量的值"写死";

    固定套路:
    1: 导包;(将别人提前写好的内容,拿到我们的代码中来使用)
    2: 创建对象;(给刚刚拿过来的内容,起个名字,以便于指挥它干活)
    3: 获取结果;(让工具,完成具体的键盘输入数据的行为)
        允许输入的数据类型有:
            整数:
                nextByte()
                nextShort()
                nextInt()
                nextLong()
            小数
                nextFloat()
                nextDouble()
            字符串
                next()
                nextLine()  有bug,不推荐使用
            布尔
                nextBoolean()

 */
public class MyScanner {
    public static void main(String[] args) {
        //2: 创建对象;(给刚刚拿过来的内容,起个名字,以便于指挥它干活)
        Scanner scanner = new Scanner(System.in);
        //  3: 获取结果;(让工具,完成具体的键盘输入数据的行为)
        System.out.println("亲,请输入一个-128到127之间的数字:");
        byte b = scanner.nextByte();
        System.out.println("亲,请输入一个21亿之内的数字:");
        int i = scanner.nextInt();
        System.out.println("亲,请输入一个小数数字:");
        double v = scanner.nextDouble();
        System.out.println("byte类型的数据是:"+b);
        System.out.println("int类型的数据是:"+i);
        System.out.println("double类型的数据是:"+v);


        System.out.println("亲,请输入一句不带空格的话:");
        String next = scanner.next();
        System.out.println("亲,请输入一句带空格的话:");
        //scanner = new Scanner(System.in);
        scanner.nextLine();
        String next2 = scanner.nextLine(); // 不能和别人一起使用,只能自己玩!!!否则会接收到别人残留在内存中的 回车换行符
        System.out.println("不带空格的话是:"+next);
        System.out.println("带空格的话是:"+next2);
    }
}
