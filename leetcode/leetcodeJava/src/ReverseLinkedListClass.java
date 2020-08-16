public class ReverseLinkedListClass {
     public class ListNode {
         int val;
         ListNode next;
         ListNode(int x) {
             val = x;
         }
     }


    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null){
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }

        return prev;
    }
}
