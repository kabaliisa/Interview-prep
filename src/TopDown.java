public class TopDown {



    public static void main(String[] args) {
        System.out.println(maxHeapTopDown(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16 }));
    }

    static int count =0;

    public static int maxHeapTopDown(int[] a){

        for(int i =1; i < a.length; i++){
            upHeap(a,i);

        }
        return count;
    }


    public static void upHeap(int[] a, int i){
        int j = i;

        while ( j > 1 & a[j/2] < a[j]){
            count++;
            swap(a , j, j/2);

            j = j/2;
        }


    }



    public static void swap(int[] a, int x, int y){
        a[y]= a[x];
        a[x]= a[y];
    }
}
