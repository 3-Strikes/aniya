package zuoye;

import java.util.Random;

public class exam {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random random = new Random();
        int max=0,minn=9999999,sum=0;
        double avg = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i]= random.nextInt(0,9)+1;
            if(arr[i]>max){
                max=arr[i];
            }else if(arr[i]<minn){
                minn = arr[i];
            }
            sum+=arr[i];
        }

        avg = sum/10;
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>avg){
                count++;
            }
        }
        System.out.println("数组元素为：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" "+arr[i]);
        }

        System.out.println();
        System.out.println("最大值:"+max);

        System.out.println("最大值:"+minn);

        System.out.println("平均值:"+avg);

        System.out.println("大于平均值的元素个数:"+count);


    }
}
