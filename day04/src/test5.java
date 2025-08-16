import java.util.Scanner;

public class test5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sbd = new StringBuilder(sc.nextLine());
        System.out.println("转换后的大写字符串为：");
        myToUpperCase(sbd);
        System.out.println("转换后的小写字符串为：");
        myToLowerCase(sbd);
    }

    public static void myToUpperCase(StringBuilder sb){
        for (int i = 0; i < sb.length(); i++) {
            char c = sb.charAt(i);
            if(c>='a'&&c<='z'){
                c-=32;//小写字母ASCII码大于大写字母，转换时应用减法
                sb.replace(i,i+1, String.valueOf(c));
            }
        }
        System.out.println(sb);
    }

    public static void myToLowerCase(StringBuilder sb){
        for (int i = 0; i < sb.length(); i++) {
            char c = sb.charAt(i);
            if(c>='A'&&c<='Z'){
                c+=32;
                sb.replace(i,i+1, String.valueOf(c));
            }
        }
        System.out.println(sb);
    }
}
