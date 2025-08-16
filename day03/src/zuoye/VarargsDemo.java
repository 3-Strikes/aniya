package zuoye;

public class VarargsDemo {
//    public static void main(String[] args) {
//        printMax(34,3,3,2,56.5);
//        printMax(new double[]{1,2,3});
//    }
//
//    public static void printMax(double... numbers){
//        if(numbers.length==0){
//            System.out.println("No argument passed");
//            return;
//        }
//
//        double result = numbers[0];
//
//        for (int i = 0; i < numbers.length; i++) {
//            if(numbers[i]>result){
//                result = numbers[i];
//            }
//        }
//        System.out.println("The max value is "+result);
//    }

//    public static void main(String[] args) {
//        int minn = printMin(2,5);
//        System.out.println(minn);
//    }
//
//    public static int printMin(int a,int b){
//        return a<b?a:b;
//    }


//    public static void main(String[] args) {
//        int q = printMax(2,5,9);
//        System.out.println(q);
//    }
//
//    public static int printMax(int a,int b,int c){
//        if(a>b){
//            if(a>c){
//                return a;
//            }else{
//                return c;
//            }
//        }else{
//            if(b>c){
//                return b;
//            }else {
//                return c;
//            }
//        }
//    }

    public static void main(String[] args) {
        abss(-7.9999999);
        abss(0.66);
    }

    public static void abss(double a){
        if(a>=0){
            System.out.println("绝对值为："+ a);
        }else {
            System.out.println("绝对值为："+ -a);
        }
    }


}
