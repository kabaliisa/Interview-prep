import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TargetIndices {
    public static void main(String[] args) {
        System.out.println(targetIndices(new int[]{1,2,2,3,5}, 2));
    }

    public static List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        var list = new ArrayList<Integer>();
        for(int i=0; i < nums.length; i++){
            if (target == nums[i]){
                list.add(i);
            }
        }
        return list;
    }
}
