import java.util.HashMap;

public class Roman {
    public static void main(String[] args) {

    }

    public int romanToInt(String s){
        int first =0;
        int second =0;
        for(int i = s.length(); i >=0 ; i--){
            int romanInt = convertToInt(s.charAt(i));
        }
        return 0;
    }

    private int convertToInt(char c) {
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
