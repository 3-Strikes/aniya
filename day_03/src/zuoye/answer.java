package zuoye;

import java.util.Random;
import java.util.Scanner;

public class answer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        while(true){
            int q1 = sc.nextInt();
            int q2 = random.nextInt(0,99)+1;
            if(q2>=1&&q2<=50){
                System.out.println("未中奖"+q2);
            }else if(q2>=51&&q2<=80){
                System.out.println("谢谢参与"+q2);
            } else if (q2>=81&&q2<=95) {
                System.out.println("5元优惠券"+q2);
            } else if (q2>=96&&q2<=100) {
                System.out.println("100元现金券"+q2);
            }
            if(q1==0){
                break;
            }
        }
        System.out.println("抽奖结束！！！");
    }
}
