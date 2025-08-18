public class Override_ex {
    public static void main(String[] args) {
        int a=100;
        System.out.println("传递前数据值为："+a);
        change(a);
        System.out.println("传递后数据值为："+a);

        int[] arr = {100};
        System.out.println("传递前数据值为："+arr[0]);
        change(arr);
        System.out.println("传递后数据值为："+arr[0]);

    }

    public static void change(int a,int b){

    }

    public static void change(double a,int b){

    }

    public static void change(int []a){
        System.out.println("传递到的数据值为："+a[0]);
        a[0] = 10;
        System.out.println("修改后的数据值为："+a[0]);
    }
    public static void a(String a,int b){

    }
    public static void change(int a){
        System.out.println("传入的数据值为："+a);
        a=999;
        System.out.println("修改后的数据值为："+a);
    }




}
