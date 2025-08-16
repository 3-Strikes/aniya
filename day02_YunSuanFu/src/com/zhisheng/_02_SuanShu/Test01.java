package com.zhisheng._02_SuanShu;
/*
    练习算术运算符的 /  %
 */
public class Test01 {
    public static void main(String[] args) {
        int a = 3;
        int b = 10;
        int c = a/b;
        int c2 = b/a;
        System.out.println(c); // 0
        System.out.println(c2);// 3

        int c3 = a%b;
        int c4 = b%a;
        System.out.println(c3); // 3
        System.out.println(c4); // 1

        // 希望  a/b的结果得到  0.3
        double c5 = a*1.0/b;
        System.out.println(c5);

        // 给你一个3位数,希望你找出每个位置上的数字
        int num = 345;
        // 求 百位的时候,直接除以 100
        // 求 十位的时候,可以先对100求余数,得到45,再除以10   或 先除以10得到 34,再对34根据10求余数
        // 求 个位的时候,直接对10求余数即可
        int bai = num /100;
        int shi = num /10%10;
        int ge = num %10;
        System.out.println(bai);
        System.out.println(shi);
        System.out.println(ge);

        // 得到一个求任意位置的数字的通用公式:  原始数据 / 位权 % 10
        int num2 = 3456789;
        System.out.println(num2 / 1000 % 10 );

    }
}
