package _数组;

public class test01 {
    enum Color{
        RED,GREEN,BLUE;
    }

    public static void main(String[] args) {
        Color[] arr = Color.values();
        for (Color col:arr){
            System.out.println(col+" at index "+col.ordinal());
        }

    }
}
