package LinkedList.sum

/**
 * https://leetcode.com/problems/add-two-numbers/description/
 */
class ListNode(var `val`: Int) {
    var next: ListNode? = null
}


class AddTwoSumLinkedList {

    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        var carry = 0
        val dummy = ListNode(0)
        var p: ListNode? = dummy
        var l1Copy = l1
        var l2Copy = l2

        while (l1Copy != null || l2Copy != null || carry != 0) {
            if (l1Copy != null) {
                carry += l1Copy.`val`
                l1Copy = l1Copy.next
            }

            if (l2Copy != null) {
                carry += l2Copy?.`val` ?: 0
                l2Copy = l2Copy?.next
            }

            p?.next = ListNode(carry % 10)
            carry /= 10
            p = p?.next
        }

        return dummy.next
    }
}

fun main() {
    // Create two example linked lists
    val l1 = ListNode(2)
    l1.next = ListNode(4)
    l1.next?.next = ListNode(3)

    val l2 = ListNode(9)
    l2.next = ListNode(6)
    l2.next?.next = ListNode(4)

    // Add the two numbers and print the result
    val solution = AddTwoSumLinkedList()
    val result = solution.addTwoNumbers(l1, l2)

    // Print the result linked list
    var current = result
    while (current != null) {
        print("${current.`val`} ")
        current = current.next
    }
}
