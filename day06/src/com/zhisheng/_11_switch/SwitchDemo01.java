package com.zhisheng._11_switch;
/*
    switch语句入门
 */
public class SwitchDemo01 {
    public static void main(String[] args) {
        int week = 3;
        /*if(week == 1){
            System.out.println("星期一");
        }*/
        switch (week){
            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
                break;
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
