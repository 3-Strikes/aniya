package 随机数;

import java.util.Random;
import java.util.Scanner;

public class example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt(),j=1;
        Random random = new Random();
        int q = random.nextInt(1,101);
        while(i!=0){
            System.out.println("这是第"+j+"次猜。");
            j++;
            int p = sc.nextInt();
            if(p>q){
                System.out.println("大了");

            }else if(p<q){
                System.out.println("小了");
            }
            if(p==q){
                System.out.println("对了");
                break;
            }
            i--;
        }
        if(i==0){
            System.out.println("你没猜对，正确答案是："+q);
        }
        sc.close();
    }
}
