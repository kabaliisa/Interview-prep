
class LinkedList{
    private ListNode head;

    public LinkedList() {
    }

    public LinkedList(ListNode head) {
        this.head = null;
    }

    public boolean isEmpty(){
        return (head == null);
    }

    public void insertFirst(int val){
        ListNode newNode = new ListNode(val);
        newNode.next = head;
        head = newNode;
    }

    public int getDecimalValue() {
        String str = "";
        ListNode current = head;
        while(current != null){

            str += current.val;
            current = current.next;

        }
        return Integer.parseInt(str, 2);

    }
    public void middleNode() {
        ListNode current = head;
        int size = 0;
        while(current != null){
            current = current.next;
            size++;
        }

        int mid = size /2;

        ListNode midNode = head;
        int counter =0;
        ListNode res = null;

        while(counter <= mid ){
            res = midNode;
            midNode = midNode.next;
            counter++;
        }

        System.out.println(res.val+"---mid val");
//
//        for(i = start; i<= mid; i++){
//
//        }

    }
}


class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) {
          this.val = val;
      }
      ListNode(int val, ListNode next) {
          this.val = val; this.next = next;
      }
}

 class Solution {
    public int getDecimalValue(ListNode head) {
        String str = "";
        ListNode current = head;
        while(current != null){

            str += current.val;
            current = current.next;

        }
        return Integer.parseInt(str, 2);

    }
}

public class DecimalValue{
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertFirst(1);
        list.insertFirst(0);
        list.insertFirst(1);


       list.getDecimalValue();

    }
}

