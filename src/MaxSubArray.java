public class MaxSubArray {
    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{1,-3,2,1,-1}));
    }

    public static int maxSubArray(int[] nums){

        int global_max = nums[0];

        int current_max = nums[0];

        for(int i =1; i < nums.length; i++){
            current_max = Math.max(nums[i], nums[i] + current_max);

            if(current_max > global_max){
                global_max = current_max;
            }
        }
        return global_max;


    }
}
