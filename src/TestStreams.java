import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestStreams {
    public static void main(String[] args) {

        System.out.println(getNames(Arrays.asList("kabaliisa","kaguta","Sarah")));
        System.out.println(getStrings(Arrays.asList(1,2,3)));
    }

    public static List<String> getNames(List<String> names){
        List<String> startWithK = names.stream().filter(n -> startsWith(n)).collect(Collectors.toList());
        return startWithK;
    }

    public static boolean startsWith(String n){
        if(n.charAt(0) == 'k'){
            return true;
        }
        return false;
    }

    public static List<String> getStrings(List<Integer> nums){
        List<String> numStrings = nums.stream().map(x -> changeToName(x)).collect(Collectors.toList());

        return numStrings;
    }

    public static String  changeToName(int i){
        switch (i){
            case 1:
                return "one";
            case 2:
                return "two";
            case 3:
                return "three";
            default:
                return null;
        }

    }

}
