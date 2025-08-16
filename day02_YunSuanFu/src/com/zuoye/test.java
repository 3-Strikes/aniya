package com.zuoye;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while(s.hasNextInt()){
            System.out.println("请问今天是工作日还是休息日？");
            int x = s.nextInt();
            if(x>=1&&x<=5){
                System.out.println("今天是工作日！！！！！");
            }else if(x>5&&x<=7){
                System.out.println("今天是休息日！！！！！！！！！！！！！！！！！！！！！！！！！！！");
            }else{
                System.out.println("错误的输入！");
            }
        }
    }
}
