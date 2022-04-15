import java.util.HashMap;

public class Roman {
    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }

    public static int romanToInt(String s){

        int sum =0;


        for(int i = 0; i < s.length(); i++){
                if(i + 1 < s.length() && convertToInt(s.charAt(i)) <convertToInt( s.charAt(i+1)) ){
                    sum = sum - convertToInt(s.charAt(i));
                }else{
                    sum = sum + convertToInt( s.charAt(i));
                }
        }
        return sum;

    }

    private static int convertToInt(char c) {
        HashMap<Character, Integer> hm = new HashMap<>();
        hm.put('I', 1);
        hm.put('V',5);
        hm.put('X',10);
        hm.put('L',50);
        hm.put('C', 100);
        hm.put('D',500);
        hm.put('M',1000);

        return hm.get(c);
    }
}
