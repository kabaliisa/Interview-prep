public class Binary {
    public static void main(String[] args) {
        System.out.println(containsNumber(new int[]{1,2,3,4,5}, 6));
    }

    private static boolean containsNumber(int[] a, int x) {
        int lower =0;
        int upper = a.length-1;

        while(lower < upper){
            int mid = (lower+upper)/2;
            if(x == a[mid]){
                return true;
            }

            if(x > a[mid]){
                lower = mid+1;
            }else{
                upper = mid -1;
            }
        }

        return false;
    }
}
