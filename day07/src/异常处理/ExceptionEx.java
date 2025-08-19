package 异常处理;

public class ExceptionEx {
    public static void main(String[] args) {
        int a[] = new int[2];
        try{
            System.out.println("输出三号元素"+a[3]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("异常为："+e);
        }finally {
            a[0]=6;
            System.out.println("第一个元素值为:"+a[0]);
            System.out.println("最终执行");
        }
    }
}
