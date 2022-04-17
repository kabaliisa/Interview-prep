class LinkedListV2 {
    Node head;

    public void append(int data){
         if(head == null){
             head = new Node(data);
             return;
         }
        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = new Node(data);
    }

    public void prepend(int data){
        if(head == null){
            head = new Node(data);
            return;
        }

        Node current = new Node(data);
        current.next= head;
        head = current;
    }

    public void delete(int data){

        if(head.data == data){
            head = head.next;
            return;
        }

        Node current = head;

      while(current.next != null){
          if(current.next.data == data){
              current.next = current.next.next;
              return;
          }
          current = current.next;
      }
    }


    public  String displayList() {
        Node current = head;

        String res = "";

        while (current.next != null){
            res += current.data + ",";
            current = current.next;

        }

       res += current.data;

        return res;

    }
}

class Node{
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }

    public void displayLink(){
        System.out.println("" + data + "");
    }

}

class TestList{
    public static void main(String[] args) {
        LinkedListV2 newList = new LinkedListV2();
        newList.append(6);
        newList.append(7);
        newList.prepend(4);
        newList.append(8);
        newList.delete(8);
        System.out.println(newList.displayList());

    }
}
