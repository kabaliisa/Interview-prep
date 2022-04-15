import java.util.HashSet;

public class Permutaion {
    public static void main(String[] args) {
        System.out.println(isPermuation("abcd", "dabc"));
    }

    public static boolean isPermuation(String str1, String str2){

        if(str1.length() != str2.length()) return false;

        HashSet<Character> hs = new HashSet<>();
        for(char c: str1.toCharArray()){
            if(!hs.contains(c)){
                hs.add(c);
            }
        }

        for( char e: str2.toCharArray()){
            if(!hs.contains(e)) return false;
        }
        return true;
    }
}
