package com.zhisheng._10_if;

/*
    练习if语句的注意事项

    当被控制的代码只有一行的时候,且不是定义变量的代码,可以省略大括号
 */
public class IfDemo04 {
    public static void main(String[] args) {
        // 比较两个数字的大小关系
        int a = 33;
        int b = 13;
        // 使用if的第3种格式完成效果
        if (a > b) {
            int c = 5;
            System.out.println(a + "大于了" + b);
            System.out.println(c);
        } else if (a < b)
            System.out.println(a + "小于了" + b);
        else
            System.out.println(a + "等于了" + b);

        System.out.println("----------------------------");
        boolean isVip = false;
        if(isVip)/*;这里千万不能加分号,否则会导致if语句无法控制后面的代码*/{ // 当变量是 布尔类型的时候,可以直接作为 if语句的值使用,如果不是布尔类型的时候,通常需要配合 关系运算符
            System.out.println("可以积分...");
        }
        System.out.println("结账了....");
    }
}
