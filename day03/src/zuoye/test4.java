package zuoye;

import java.util.Scanner;

public class test4 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        StringBuilder sbd = new StringBuilder(sc.nextLine());
//        if(isduicheng(sbd)){
//            System.out.println(sbd+"是对称字符串");
//        }else {
//            System.out.println(sbd+"不是对称字符串");
//        }
//    }
//
//    public static boolean isduicheng(StringBuilder str){
//        StringBuilder tmps = str.reverse();
//        if(tmps==str){
//            return true;
//        }else {
//            return false;
//        }
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sbd = new StringBuilder(sc.nextLine());
        isWord_or_Digit(sbd);

    }

    public static void isWord_or_Digit(StringBuilder str){
        int count1=0,count2=0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(Character.isDigit(c)){
                count1++;
            }else if (Character.isLetter(c)){
                count2++;
            }
        }
        System.out.println("字符串中有"+count1+"个数字 "+"有"+count2+"个中英文字母");
    }


}
