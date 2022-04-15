public class BinarySearch {
    public static void main(String[] args) {
        System.out.println(binarySearch(new int[]{1,3,5,7,9}, 7));
    }

    
    public static int binarySearch(int[]arr, int item){
        int low = 0;
        int high = arr.length -1;
        int guess = 0;

        while(low <= high){
            int mid = (low + high) /2;
            guess = arr[mid];
            if(guess == item) return mid;
            if(guess > item){
                high = mid -1;
            }else {
                low = mid + 1;
            }
        }
         return 0;
    }


}
