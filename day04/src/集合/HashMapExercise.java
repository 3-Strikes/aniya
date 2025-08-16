package 集合;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapExercise {
    public static void main(String[] args) {
        String str = "hello world java";
        System.out.println("原始字符串:"+str);

        Map<Character,Integer> charCountMap = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if(charCountMap.containsKey(c)){
                charCountMap.put(c,charCountMap.get(c)+1);
            }else {
                charCountMap.put(c,1);
            }
        }

        Map<Character,Integer> sortedMap = new TreeMap<>(charCountMap);

        System.out.println("字符出现次数统计：");
        for(Map.Entry<Character,Integer> entry:sortedMap.entrySet()){
            String charStr = entry.getKey()==' '?"空格":entry.getKey().toString();
            System.out.println(charStr+":"+entry.getValue()+"次");
        }

    }
}
