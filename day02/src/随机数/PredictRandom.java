package 随机数;

import java.lang.reflect.Field;
import java.util.Random;

public class PredictRandom {
    public static void main(String[] args) throws Exception {
        Random rand = new Random();

        // 反射获取内部种子值（非公开字段）
        Field seedField = Random.class.getDeclaredField("seed");
        seedField.setAccessible(true);
        long seedValue = ((java.util.concurrent.atomic.AtomicLong) seedField.get(rand)).get();

        // 使用相同种子创建新Random实例
        Random predictor = new Random(seedValue ^ 0x5DEECE66DL); // 补偿算法初始异或

        // 验证预测能力
        int actual = rand.nextInt(100);
        int predicted = predictor.nextInt(100);

        System.out.println("实际值: " + actual + " | 预测值: " + predicted);
    }
}