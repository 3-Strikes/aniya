package zuoye;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class answer {
    public static void main(String[] args) {
        System.out.println("欢迎来到学生管理系统：");
        System.out.println("--------------------");
        System.out.println("输入1生成五个学生的随机成绩");
        System.out.println("输入2计算平均分并输出");
        System.out.println("输入3输出最高分和最低分");
        System.out.println("输入4输出及格人数");
        System.out.println("输入5使用冒泡排序对成绩进行降序排列并输出");
        System.out.println("输入任意字母，可退出程序");
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        while(sc.hasNextInt()){
            int q = sc.nextInt();
            abc :switch (q){
                case 1 -> {
                    outStudent(arr,5);
                    System.out.println("已生成5个学生的随机成绩："+ Arrays.toString(arr));
                }
                case 2 -> {
                    double aveg = calculateAve(arr);
                    System.out.println("平均分为："+aveg);
                }
                case 3 -> {
                    int maxx=0,minn=99999999;
                    for (int i = 0; i < arr.length; i++) {
                        if(maxx<arr[i]){
                            maxx = arr[i];
                        }
                        if(minn>arr[i]){
                            minn = arr[i];
                        }
                    }
                    System.out.println("最大值为："+maxx+" 最小值为："+minn);
                }
                case 4 -> {
                    int count = countPass(arr);
                    System.out.println("及格人数为:"+count);
                }
                case 5 -> {
                    BubbleSort(arr);
                    System.out.println("冒泡排序降序输出结果为："+Arrays.toString(arr));
                }
            }
        }
    }

    public static int[] outStudent(int[] a,int b){
        Random random = new Random();
        for (int i = 0; i < b; i++) {
            a[i]= random.nextInt(101);
        }
        return a;
    }

    public static double calculateAve(int a[]){
        double sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum+=a[i];
        }
        double ave = sum/a.length;
        return ave;
    }

    public static int countPass(int[] a){
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]>=60){
                count++;
            }
        }
        return count;
    }

    public static int[] BubbleSort(int[] a){
        for(int i=0;i<a.length-1;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]<a[j]){
                    int temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
        }
        return a;
    }

}
