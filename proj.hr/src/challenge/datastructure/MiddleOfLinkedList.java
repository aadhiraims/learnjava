package challenge.datastructure;

/**
 * Identify the Middle element of Singly Linked List and
 * return the list from that point
 */
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
    }
}

public class MiddleOfLinkedList {
    public static void main(String[] args) {
        ListNode ls1 = new ListNode(1);
        ListNode ls2 = new ListNode(2);
        ListNode ls3 = new ListNode(3);
        ListNode ls4 = new ListNode(4);
        ListNode ls5 = new ListNode(5);
        ls1.next = ls2;
        ls2.next = ls3;
        ls3.next = ls4;
        ls4.next = ls5;


        MiddleOfLinkedList ml = new MiddleOfLinkedList();
        ml.middleNode(ls1);
    }

    public ListNode middleNode(ListNode head) {
        ListNode temp = head;
        int count = 0;
        while(temp!=null){
            System.out.print(temp.val+"  -->  ");
            temp = temp.next;
            count++;
        }
        System.out.println("Number of nodes: "+count);
        int start = count/2;
        int i = 0;
        while( i < start){
            head = head.next;
            i++;
        }
        temp = head;
        while(temp!=null){
            System.out.print(temp.val+"  -->  ");
            temp = temp.next;
        }
        return head;
    }
}
