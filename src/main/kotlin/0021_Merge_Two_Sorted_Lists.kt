
class Solution0021 {
//
//    var li = ListNode(5)
//    var v = li.`val`
//
//    class ListNode(var `val`: Int) {
//        var next: ListNode? = null
//
//    }
//
//    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
//
//        var l1 = list1
//        var l2 = list2
//        var head = ListNode()
//        var tail = head
//        while (l1!=null && l2!=null){
//            if (l1!!.`val` < l2!!.`val`){
//                tail!!.next = l1
//                l1 = l1.next
//            }else {
//                tail!!.next = l2
//                l2 = l2.next
//            }
//            tail = tail.next
//        }
//        if (l1!=null){
//            tail!!.next = l1
//        }else {
//            tail!!.next = l2
//        }
//        return head.next
//    }
}