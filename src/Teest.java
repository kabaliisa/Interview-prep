import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

public class Teest {
    public static void main(String[] args) {
//        System.out.println(solution(
//                new int[]{1,2,3}, new int[]{1,2,3}, 31
//        ));

        List<Integer> list2 = Arrays.asList(2,3,4,5);
        list2.forEach(i -> System.out.println(i));

//        System.out.println(solution2(new int[]{1,2,3,4,5}, 3));



    }

    static int solution(int[] a, int[] b, int k) {

       ArrayList<Integer> l = new ArrayList<>();
       for(int i: b){
           l.add(i);
       }

        int count =0 ;


        for(int i = a.length - 1, index = 0; i >= 0; i--, index++ ){

            String pair = "";
            pair = ""+a[i]+l.get(index);
            System.out.println(pair);

            if(Integer.parseInt(pair) < k){
                count++;
            }

        }


        return count;

    }

//    static long solution2(int[] a, int k) {
//
//        Stack<Integer> stack2 = new Stack<>();
//        for(int i : a){
//            stack2.push(i);
//        }
//
//        long count =0;
//
//
//        for(int i = 0; i < a.length; i++){
////          if(list.containsKey())
//            Stack stack1 = stack2;
//            for(int j= i+1; j <  a.length; j++){
//                System.out.println(stack1.peek());
//                if(a[i] != stack1.peek()){
//                    System.out.println(a[i] +""+ stack1.peek());
//
//                    if( (a[i] + stack1.pop()) % k == 0){
//
//                        count++;
//                    }
//                }
//
//            }
//        }
//        return count;
//
//    }

}
