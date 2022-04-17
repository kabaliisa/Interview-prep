import java.util.Arrays;
import java.util.Random;


public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Random rand = new Random();
        for(int i = 0; i < arr.length; i++){
            arr[i] = rand.nextInt(100);
        }
        System.out.println(Arrays.toString(insertionSort(arr)));

    }

    public static int[] insertionSort(int[] a){
        for(int i =1; i < a.length; i++){
            for(int j =0; j < i ; j++){
                swap(a, j, i);
            }
        }
        return a;
    }

    private static void swap (int[] a, int j,  int i ){
        if(a[j] > a[i]){
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
    }
}
