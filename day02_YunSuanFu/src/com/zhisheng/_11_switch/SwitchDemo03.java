package com.zhisheng._11_switch;
/*
    JDK17新的箭头函数,可以预防switch语句的穿透
 */
public class SwitchDemo03 {
    public static void main(String[] args) {
        int week = 3;
        switch (week){
            case 1 ->
                System.out.println("星期一");
            case 2 ->
                System.out.println("星期二");
            case 3->
                System.out.println("星期三");
            case 4->
                System.out.println("星期四");
            case 5->
                System.out.println("星期五");
            case 6->
                System.out.println("星期六");
            case 7->
                System.out.println("星期天");
            default->
                System.out.println("数据有误!");
        }
        System.out.println("------------------------");
        String res = switch (week){
            case 1 ->
                    "星期一";
            case 2 ->
                    "星期二";
            case 3->
                    "星期三";
            case 4->
                    "星期四";
            case 5->
                    "星期五";
            case 6->
                    "星期六";
            case 7->
                    "星期天";
            default->
                    "数据有误!";
        };
        System.out.println(res);

    }
}
