import java.util.Arrays;

public class sort_ex {
    public static void main(String[] args) {
        int[] arr = {5,8,32,4,89,2,0,321,65,78,342,65432,4326};
        System.out.println("选择排序前："+Arrays.toString(arr));
        selectionSort(arr);
        System.out.println("选择排序后："+Arrays.toString(arr));
    }

    /*
     * 选择排序
     * 原理：首先在未排序序列中找到最小（大）元素，存放到排序序列的起始位置，
     * 然后，再从剩余未排序元素中继续寻找最小（大）元素，然后放到已排序序列的末尾
     */
    public static void selectionSort(int[] arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            //找到未排序部分的最小元素索引
            int minIndex = i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex = j;
                }
            }
            //交换找到的最小元素和未排序部分的第一元素
            int temp =arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] =temp;
        }
    }

    /*
     * 冒泡排序
     * 原理：重复地走访过要排序的数列，一次比较两个元素，如果它们的顺序错误就把它们交换过来
     */
    public static void bubbleSort(int[] arr){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            //标记本轮是否有交换，如果没有则说明数组已经有序
            boolean swapped = false;
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[i];
                    arr[j] = arr[j+1];
                    arr[j+1]=temp;
                    swapped = true;
                }
            }

            if(!swapped) break;
        }
    }

    /*
     * 插入排序
     * 原理：构建有序序列，对于未排序数据，在已排序序列中从后向前扫描，找到相应位置并插入
     */

    public static void insertionSort(int[] arr){
        int n = arr.length;
        for(int i=1;i<n;i++){
            int key = arr[i];
            int j = i-1;

            //将大于key的元素向后移动
            while(j>=0&&arr[j]>key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }

    /*
     * 希尔排序
     * 原理：是插入排序的改进版，先将整个待排序的记录序列分割成为若干子序列分别进行直接插入排序，
     * 待整个序列中的记录"基本有序"时，再对全体记录进行依次直接插入排序
     */

    public static void shellSort(int[] arr){
        int n = arr.length;
        //初始长度为数组长度的一半，逐渐减小步长
        for(int gap = n/2;gap>0;gap/=2){
            //对每个子数组进行插入排序
            for(int i=gap;i<n;i++){
                int temp = arr[i];
                int j;
                //移动同组中比temp大的元素
                for(j=i;j>=gap&&arr[j-gap]>temp;j-=gap){
                    arr[j]=arr[j-gap];
                }
                arr[j] = temp;
            }
        }
    }

    /**
     * 二分查找
     * 原理：在有序数组中，将数组中间位置的值与目标值比较，如果两者相等，则找到目标值；
     * 如果目标值大于中间位置的值，则在数组大于中间位置的那部分中查找；
     * 否则在数组小于中间位置的那部分中查找，重复以上过程，直到找到目标值或查找范围为空
     */
    public static int binarySearch(int[] arr,int target){
        int left = 0;
        int right = arr.length-1;

        while (left<=right){
            int mid = left+(right-left)/2;
            if(arr[mid]==target){
                return mid;
            }

            if(arr[mid]<target){
                left = mid+1;
            }
            if(arr[mid]<target){
                left = mid-1;
            }else {
                right = mid-1;
            }
        }
        return -1;
    }

}
