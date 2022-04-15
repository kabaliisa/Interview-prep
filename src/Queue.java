import java.util.ArrayList;
import java.util.List;

public class Queue {
    List<Integer> list = new ArrayList<>();

    public Queue() {

    }

    public void enqueue(Integer n){
        list.add(n);
    }
    public List<Integer> dequeue(){
        if(!(list.isEmpty())){
            list.remove(list.get(0));
        }

        return list;
    }
}


