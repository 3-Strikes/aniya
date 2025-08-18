package com.zhisheng._10_if;
/*
    练习if语句的第2种格式

    适用的场景:
     某件事,必须要做,但是只能二选一的做

 */
public class IfDemo02 {
    public static void main(String[] args) {
        int a = 101;
        // 判断数字是否能被2整除,能整除的就是偶数,否则就是奇数
        if(a%2 == 0){
            System.out.println(a+"是偶数");
        }else {
            System.out.println(a+"是奇数");
        }
    }
}
