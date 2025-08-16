package zuoye;

import java.util.Random;
import java.util.Scanner;

public class answer {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请设置生成数组的长度：");

        int len = sc.nextInt();
        int[] arr1 = new int[len];

        System.out.println("请指定数组数值范围为：");
        int be = sc.nextInt();
        int en = sc.nextInt();

        out_Array(be,en,arr1);
        System.out.print("数组内容为：");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]+" ");
        }
        System.out.println();

        int sum = sumEvenNumber(arr1);
        System.out.println("偶数和为："+sum);


        int maxx = findMax(arr1);

        System.out.println("最大值为："+maxx);
    }

    public static void out_Array(int q,int p,int[] arr){//起始 和数组
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i]=random.nextInt(q,p+1);
        }
    }

    public static int sumEvenNumber(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2==0){
                sum+=arr[i];
            }
        }
        return sum;
    }

    public static int findMax(int[] arr){
        int maxx=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>maxx){
                maxx=arr[i];
            }
        }
        return maxx;
    }

}
