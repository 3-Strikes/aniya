package 输入练习;

import java.util.Scanner;

public class MyScaner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入句子不带空行：");
        String s = sc.next();
        System.out.println("您输入的是："+s);

    }

}
