import java.util.Arrays;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamPrac {
    private String ownerName;
    private int balance;
    private int acctId;

    public StreamPrac(String ownerName, int balance, int acctId) {
        this.ownerName = ownerName;
        this.balance = balance;
        this.acctId = acctId;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public int getBalance() {
        return balance;
    }

    public int getAcctId() {
        return acctId;
    }

    @Override
    public String toString() {
        return "StreamPrac{" +
                "ownerName='" + ownerName + '\'' +
                ", balance=" + balance +
                ", acctId=" + acctId +
                '}';
    }

        public static void main(String[] args) {

        Stream<String> strings = Stream.of("A","good","day","to","write","some","java");

        String s = strings.reduce("", ( x,   y) -> x +" "+  y);
        System.out.println(s);

        List<Integer> numbers= Arrays.asList(2,3,4,5);

        Integer num = numbers.stream().reduce(0, (x,y)-> x+y);
            System.out.println("-----reduced value---"+num);

        Integer num2 = numbers.stream().reduce(1, (x,y)-> x*y);
        System.out.println("-----reduced value---"+num2);

            StreamPrac a1 = new StreamPrac("solo",3000,2);
            StreamPrac a2 = new StreamPrac("kab",100,6);
            StreamPrac a3 = new StreamPrac("tek",400,4);
            StreamPrac a4 = new StreamPrac("john",9000,3);

            List<StreamPrac> list = Arrays.asList(a1,a2,a3,a4);

            DoubleSummaryStatistics summary = list.stream()
                    .collect(Collectors.summarizingDouble(StreamPrac::getBalance));
            System.out.println(summary.getMax());
            System.out.println(summary.getAverage());
            System.out.println(summary.getMin());

            List<StreamPrac> acctList = list.stream()
                    .sorted(Comparator.comparing(StreamPrac::getBalance)
                            .thenComparing(StreamPrac::getOwnerName)).collect(Collectors.toList());

            System.out.println(acctList);

//        Stream<Integer> oddStream = Stream.iterate(1, n -> n+2);
//
//        List<Integer> oddStream2 = oddStream.skip(4).limit(4).collect(Collectors.toList());
//
//        System.out.println(oddStream2.stream().collect(Collectors.toList()));

        List<Integer> ints = Arrays.asList(3,5,2,3,8);

        List<int[]> intArrs = ints.stream()
                .map(int[]:: new)
                .collect(Collectors.toList());



        List<String> intArrsStr = intArrs.stream().map(Arrays::toString)
                .collect(Collectors.toList());

        Stream<String> uniqueWords
                = Stream.of("merrily", "merrily", "merrily","gently")
                .distinct();
        System.out.println(uniqueWords);




    }


}
