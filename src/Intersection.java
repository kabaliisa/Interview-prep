import java.util.*;
import java.util.HashSet;

public class Intersection {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(intersection(new int[]{1,2,2,1},new int[]{2,2})));
    }

    public static int[] intersection(int[] nums1, int[] nums2){
        HashSet<Integer> hs = new HashSet<>();
        HashMap<Integer, Integer> k = new HashMap<>();

        var list = new ArrayList<Integer>();

        for(int j: nums1){
                hs.add(j);
        }

        for(int i =0; i< nums2.length; i++){
            if(hs.contains(nums2[i])){
                if(!list.contains(nums2[i])){
                    list.add(nums2[i]);

                }
            }
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}
