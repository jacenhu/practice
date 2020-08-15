public class IntersectionOfTwoLinkedLists {
     public class ListNode {
         int val;
         ListNode next;
         ListNode(int x) {
             val = x;
             next = null;
         }
     }


    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode pHeadA = headA;
        ListNode pHeadB = headB;

        while (pHeadA != pHeadB){
            pHeadA = pHeadA == null ? headB : pHeadA.next;
            pHeadB = pHeadB == null ? headA : pHeadB.next;
        }

        return pHeadA;
    }

    public static void main(String args[]){

    }
}
