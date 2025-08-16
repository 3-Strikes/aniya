package com.zhisheng._07_逻辑运算符;
/*
    练习逻辑运算符
 */
public class Test07 {
    public static void main(String[] args) {
        int a =3,b=4,c=5;
        System.out.println(a > b || b < c); // true
        System.out.println(a > b && (b+=5) < c); // false  短路的现象,当仅根据第1个条件,就能确定最终的结果了,那么后面的条件就不会在执行了!!!
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        // ! 是一元运算符
        System.out.println(!true);
        System.out.println(!false);

        System.out.println(!(a>b));
        System.out.println("-------------------------");
        System.out.println(a > b & (b+=2) < c); // 不会短路,无论如何都会把两个条件执行完,效率相对较低,建议永远使用 && 和 ||
        System.out.println(b);
    }
}
