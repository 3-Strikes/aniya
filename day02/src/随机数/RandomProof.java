package 随机数;

import java.util.Random;

public class RandomProof {
    public static void main(String[] args) {
        long seed = 12345L; // 固定种子

        Random rand1 = new Random(seed);
        Random rand2 = new Random(seed); // 使用相同种子

        // 生成并比较序列
        for (int i = 0; i < 5; i++) {
            int num1 = rand1.nextInt(100);
            int num2 = rand2.nextInt(100);
            System.out.println("rand1: " + num1 + " | rand2: " + num2 + " | 相等: " + (num1 == num2));
        }
    }
}

