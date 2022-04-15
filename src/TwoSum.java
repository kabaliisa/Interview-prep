import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoSum {


    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{3,2,4}, 6)));
    }

    public static int[] twoSum(int[] nums, int target) {

        List<Integer> list = new ArrayList<>();


        for(int i =0; i < nums.length; i++){

            if(list.contains(target - nums[i])){
                return new int[]{i, list.indexOf(target-nums[i])};
            }else{
                list.add(nums[i]);
            }

        }

        return new int[]{};

    }
}
