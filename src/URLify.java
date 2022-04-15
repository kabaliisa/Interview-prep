public class URLify {
    public static void main(String[] args) {
        System.out.println(urlify("Mr John Smith  ", 13));
    }

    public static  String urlify(String s, int len){
        String[]  strs = s.split(" ");
        return String.join("%20",strs);

    }
}
