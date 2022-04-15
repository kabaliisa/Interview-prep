import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.List;

public class Duplicate {
    public static void main(String[] args) {
        System.out.println(duplicates(new int[]{1,2,1,3,5,2}));


    }

    public static String duplicates(int[] arr){
        Hashtable<Integer, Integer> ht = new Hashtable<>();

        List<Integer> duplicates = new ArrayList<>();

        for(int i: arr){
            if(ht.containsValue(i)){
                duplicates.add(i);
            }else{
                ht.put(i,i);
            }
        }
        return "" + duplicates + " " + duplicates.size();

    }


}
