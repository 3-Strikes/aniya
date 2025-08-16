package 集合;

import java.util.*;

public class SetExercise {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList(
                "APPLE","BANANA","APPLE","ORANGE","BANANA"
        );

        System.out.println("原始列表："+stringList);

        //1.HashSet去重
        Set<String> hashSet = new HashSet<>(stringList);
        System.out.println("去重后的元素："+hashSet);

        //2.排序一 使用TreeSet去除重复元素
        Set<String> treeSet = new TreeSet<>(stringList);
        System.out.println("TreeSet排序后："+treeSet);

        //3.使用HashSet去重后转为List再排序
        List<String> sortedList = new ArrayList<>(hashSet);
        Collections.sort(sortedList);
        System.out.println("ArrayList排序后:"+sortedList);

        //4.统计去重后元素个数
        System.out.println("去重后的元素个数："+hashSet.size());

    }
}
