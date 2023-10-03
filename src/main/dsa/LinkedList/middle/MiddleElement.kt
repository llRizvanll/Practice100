package LinkedList.middle

/**
 * Given the head of a singly linked list, return the middle node of the linked list. If there are two middle nodes, return the second middle node.
 */

/**
 * Example:
 * var li = LinkNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class LinkNode(var `val`: Int) {
 *     var next: LinkNode? = null
 * }
 */
    fun MiddleElement(node : LinkNode) : LinkNode? {
        var p1 = node.head
        var p2 = node.head

        while (p2!= null && p2.next != null){
            p1 = p1?.next;
            p2 = p2?.next?.next;
        }
        return p1;
    }
