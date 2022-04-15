public class MiddleNode {
    public ListNode middleNode(ListNode head) {
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
        return res;

    }
}
