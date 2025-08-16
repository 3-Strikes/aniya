package com.zhisheng._11_switch;
/*
    switch语句穿透
 */
public class SwitchDemo02 {
    public static void main(String[] args) {
        int week = 3;
        switch (week){
            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三"); // 由于这里没有break,因此执行后,会直接执行(穿透)下一个case的内容,直到遇到break或大括号结束为止
            case 4:
                System.out.println("星期四");
            case 5:
                System.out.println("星期五");
            case 6:
                System.out.println("星期六");
                break;
            case 7:
                System.out.println("星期天");
                break;
            default:
                System.out.println("数据有误!");
                break;
        }
    }
}
