import java.util.*;
public class array_exercise {
    public static void main(String[] args) {
        int[] arrayOne = {1,2,3,4,5,6,7,8,9};
        int[] arrayTwo;
        arrayTwo = new int[10];
        int[] arrayThree = new int[10];

        double[] arrayFour = new double[10];
        double total1 = 0,total2 = 0;
        for(int i = 0; i<10;i++){
            arrayFour[i]=(int)(Math.random()*100)+1;
//            System.out.println(arrayFour[i]);
            total1+=arrayFour[i];
        }

        int[] arrayFive = new int[10];
        for(int j = 0;j<10;j++){
            arrayFive[j] = (int) (Math.random()*100)+1;
//            System.out.println(arrayFive[j]);
            total2+=arrayFive[j];
        }
        System.out.println(total1);
        System.out.println(total2);

        System.out.println(Arrays.toString(arrayFour));
        Arrays.sort(arrayFour,0,10);
        System.out.println(Arrays.toString(arrayFour));

        System.out.println(Arrays.toString(arrayFive));
        Arrays.sort(arrayFive,0,10);
        System.out.println(Arrays.toString(arrayFive));

        int q = Arrays.binarySearch(arrayFive,60);
        System.out.println(q);
        int p = Arrays.binarySearch(arrayFour,78);
        System.out.println(p);

        Integer[] arr5 = Arrays.stream(arrayFive).boxed().toArray(Integer[]::new);
        Arrays.sort(arr5,Collections.reverseOrder());
        System.out.println(Arrays.toString(arr5));

        Double[] arr4 = Arrays.stream(arrayFour).boxed().toArray(Double[]::new);
        Arrays.sort(arr4,Collections.reverseOrder());
        System.out.println(Arrays.toString(arr4));

        Arrays.sort(arr4, new Comparator<Double>() {
            @Override
            public int compare(Double o1, Double o2) {
                return Double.compare(o2,o1);
            }
        });
        System.out.println(Arrays.toString(arr4));
    }
}

//class MyComparable implements Comparator<Integer>{
//    @Override
//    public int compare(Integer o1,Integer o2){
//        return o2.intValue() - o1.intValue();
//    }
//}