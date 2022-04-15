import java.util.Arrays;


public class ProductExceptSelf {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(productExceptSelf(new int[]{1,2,3,4})));
    }

    public static int[] productExceptSelf(int[] nums) {
//
//        int N = nums.length;
//
//        int[] ans = new int[N];
//
//        int[] leftProd = new int[N];
//        int[] rightProd = new int[N];
//        leftProd[0]=1;
//        rightProd[N-1] = 1;
//
//
//        for(int i= 1; i < N; i++){
//            leftProd[i]=nums[i-1]*leftProd[i-1];
//        }
//
//
//        for(int i = N-2; i>=0; i--){
//            rightProd[i]= nums[i+1] * rightProd[i+1];
//        }
//
//        for (int i =0; i< N; i++){
//            ans[i]= leftProd[i]* rightProd[i];
//        }
//
//        return ans;



        int N = nums.length;

        int[] ans = new int[N];

        ans[0]=1;

        for(int i= 1; i < N; i++){
            ans[i]=nums[i-1]*ans[i-1];
        }

        int R = 1;

        for(int i = N-1; i>=0; i--){
            ans[i]= ans[i] * R;
            R= R* nums[i];
        }


        return ans;


    }
}
