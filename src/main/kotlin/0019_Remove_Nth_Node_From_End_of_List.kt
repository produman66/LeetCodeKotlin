/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution0019{

    //     var li = ListNode(5)
//     var v = li.`val`
//     class ListNode(var `val`: Int) {
//         var next: ListNode? = null
//     }
//    fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
//
//        if (head == null || (head.next == null && n == 1)) {
//            return null
//        }
//        var copy = ListNode(0, head)
//        var count = n
//        var r = head
//        var l = copy
//
//        while (count > 0 && r != null) {
//            r = r!!.next
//            count--
//
//        }
//        while (r != null) {
//            r = r?.next
//            l = l?.next!!
//        }
//        l.next = l.next!!.next
//
//        return copy.next
//    }
}