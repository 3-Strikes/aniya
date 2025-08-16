public class test03 {
    public static void main(String[] args) {
        double high = 8848.86;
        double first = 0.001;
        int count = 0;
        while(first<=high){
            first*=2;
            count++;
        }
        System.out.println(count);
    }
}
