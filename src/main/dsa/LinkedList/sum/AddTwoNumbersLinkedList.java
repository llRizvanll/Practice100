package LinkedList.sum;
/**
 * https://leetcode.com/problems/add-two-numbers/description/
 */
class TwoListNode {
    int val;
    TwoListNode next;

    public TwoListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class AddTwoNumbersLinkedList {

    public TwoListNode addTwoNumbers(TwoListNode l1, TwoListNode l2) {
        TwoListNode dummy = new TwoListNode(0);
        TwoListNode temp = dummy;
        int carryOver = 0;

        //either of these should be empty
        while (l1 !=null || l2 !=null || carryOver!=0){

            carryOver += l1!=null ? l1.val : 0;

            carryOver += l2!=null ? l2.val : 0;

            //point value to new node
            temp.next = new TwoListNode(carryOver % 10);

            //keep the carry over
            carryOver /= 10;

            //move the pointer
            temp = temp.next;

            // make sure they're pointing new node after each iteration
            l1 = l1!=null ? l1.next: null;
            l2 = l2!=null ? l2.next: null;

        }

        // node reference point to end of it.
        return dummy.next;
    }

    public static void main(String[] args) {
        // Create two example linked lists
        TwoListNode l1 = new TwoListNode(2);
        l1.next = new TwoListNode(4);
        l1.next.next = new TwoListNode(3);

        TwoListNode l2 = new TwoListNode(9);
        l2.next = new TwoListNode(6);
        l2.next.next = new TwoListNode(4);

        // Add the two numbers and print the result
        AddTwoNumbersLinkedList solution = new AddTwoNumbersLinkedList();
        TwoListNode result = solution.addTwoNumbers(l1, l2);

        // Print the result linked list
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}

