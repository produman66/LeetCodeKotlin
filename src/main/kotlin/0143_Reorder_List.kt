class Solution0143 {
//    fun reorderList(head: ListNode?): Unit {
//        if (head == null || head.next == null)
//            return
//
//        var slow = head
//        var fast = head.next
//
//        while (fast != null && fast.next != null && slow != null) {
//            fast = fast.next!!.next
//            slow = slow.next
//        }
//
//        var prev: ListNode? = null
//        var curr1 = slow!!.next
//
//        while (curr1 != null) {
//            var next = curr1.next
//            curr1.next = prev
//            prev = curr1
//            curr1 = next
//        }
//
//        slow.next = null
//        var curr = head
//
//        while (curr != null && prev != null) {
//            val next = curr.next
//            val revNext = prev.next
//            curr.next = prev
//            prev.next = next
//            curr = next
//            prev = revNext
//        }
//    }
}