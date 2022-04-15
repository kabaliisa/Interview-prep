import java.util.LinkedList;

public class Stack {
    LinkedList<Integer> linkedList = new LinkedList<>();

    public Integer push(Integer n){

        linkedList.addFirst(n);
        return n;
    }

    public Integer pop(){
        if(!(linkedList.isEmpty())){
            return linkedList.removeFirst();
        }
        return null;
    }

    public Integer peek(){
        if(!(linkedList.isEmpty())){
            return linkedList.getFirst();
        }
        return null;
    }

}


