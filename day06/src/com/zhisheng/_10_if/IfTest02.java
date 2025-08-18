package com.zhisheng._10_if;
/*
    需求:
        根据年龄的值判断属于什么人群;
 */
public class IfTest02 {
    public static void main(String[] args) {
       int age = 66;
      /* if(17 >= age && age >= 0 ){
           System.out.println(age+"岁是未成年人...");
       }else if(age >= 18 && age <= 65){
           System.out.println(age+"岁是青年人...");
       }else if(age >= 66 && age <= 79){
           System.out.println(age+"岁是中年人...");
       }else if(age >= 80 && age <= 99){
           System.out.println(age+"岁是老年人...");
       }else if(age >= 100){
           System.out.println(age+"岁是长寿老年人...");
       }else {
           System.out.println(age+"岁年龄不合法!");
       }*/

        // 先排除所有不合法的数据,再利用 if ...else if的逐个条件判断(短路)的效果,简化上面的代码编写
        if(age < 0){
            System.out.println(age+"岁年龄不合法!");
        }else {
            // 代码执行到这里的时候,年龄就是一个合法的值
            if(age <= 17){
                System.out.println(age+"岁是未成年人...");
            }else if(age <= 65){
                System.out.println(age+"岁是青年人...");
            }else if(age <= 79){
                System.out.println(age+"岁是中年人...");
            }else if(age <= 99){
                System.out.println(age+"岁是老年人...");
            }else {
                System.out.println(age+"岁是长寿老年人...");
            }
        }

        int  a = 3,b = 5;
        //a < b? System.out.println(a):System.out.println(b); // 三元运算符的 冒号左右两边必须是两个数据值不能是输出语句!!!


    }
}
