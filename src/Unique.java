import java.util.Arrays;
import java.util.HashSet;

public class Unique {
    public static void main(String[] args) {
        System.out.println(isUnique("sol"));
    }

//    public  static  boolean isUnique(String s){
//
//        HashSet<Character> hs = new HashSet<>();
//        char[] arr = s.toCharArray();
//        for(char c: arr){
//            if(hs.add(c) == false) return false;
//        }
//
//        return true;
//    }

    public  static  boolean isUnique(String str){
        if( str.length() > 128) return false;

        boolean[] char_set = new boolean[128];

        for(int i =0; i < str.length(); i++){
            int val = str.charAt(i);

            if(char_set[val]){
                return false;
            }

            char_set[val] = true;
        }

        return true;

    }
}
