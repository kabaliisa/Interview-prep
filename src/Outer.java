import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Outer {
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(1,2,3,4);
        l.forEach(k -> System.out.println(k));
    }
}