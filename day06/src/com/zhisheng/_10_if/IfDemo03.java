package com.zhisheng._10_if;
/*
    练习if语句的第3种格式

    适用的场景:
     某件事,可以多选一的做

 */
public class IfDemo03 {
    public static void main(String[] args) {
        // 比较两个数字的大小关系
        int a = 13;
        int b = 13;
        // 使用if的第3种格式完成效果
        if(a > b){
            System.out.println(a+"大于了"+b);
        }else if(a < b){
            System.out.println(a+"小于了"+b);
        }else {
            System.out.println(a+"等于了"+b);
        }
    }
}
