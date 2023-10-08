package LinkedList.other;

/**
 * Given the head of a singly linked list, reverse the list, and return the reversed list.
 * Input: head = [1,2,3,4,5]
 * Output: [5,4,3,2,1]
 */
public class ReverseLinkedList {

    int val;
    ReverseLinkedList next;
    ReverseLinkedList(){}

    ReverseLinkedList(int val){ this.val = val;}

    ReverseLinkedList(int val, ReverseLinkedList node){
        this.val= val;
        this.next = node;
    }

    public ReverseLinkedList reverseList(ReverseLinkedList head) {
        ReverseLinkedList newHead = null;
        while (head!=null){
            ReverseLinkedList next = head.next;
            head.next = newHead;
            newHead = head;
            head = next;
        }
        return newHead;
    }

}
