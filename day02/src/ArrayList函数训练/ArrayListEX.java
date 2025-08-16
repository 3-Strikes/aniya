package ArrayList函数训练;

import java.util.ArrayList;

public class ArrayListEX {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();

        list1.add("666");
        list1.add("启动！");
        list1.add("鸣潮!");

        System.out.println(list1);

        ArrayList<String> list2 = new ArrayList<>();

        list2.add("原神！");
        list2.add("启动！");

        list2.addAll(list1);
        list2.addAll(1,list1);

        System.out.println(list2);

        abc:for (int i = 0; i < list2.size(); i++) {
            System.out.println(list2.get(i));
            if(i == list2.size()-1) break abc;
        }




    }
}
