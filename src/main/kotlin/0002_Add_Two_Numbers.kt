/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution0002 {
//    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
//        var l =l1
//        var r = l2
//        var plus = 0
//        var ans:ListNode? = null
//        var s = l!!.`val` + r!!.`val`
//        if (s >= 10){
//            ans = ListNode(s%10)
//            plus = 1
//        }else {
//            ans = ListNode(s)
//            plus = 0
//        }
//        l = l.next
//        r = r.next
//
//        var ans1 = ans
//
//        while (l!=null && r!= null){
//            var sum = l.`val`+r.`val` + plus
//            if (sum>=10){
//                plus = 1
//                val newNode = ListNode(sum%10)
//                ans1!!.next = newNode
//                ans1 = newNode
//                l = l.next
//                r = r.next
//            }else {
//                plus = 0
//                val newNode = ListNode(sum)
//                ans1!!.next = newNode
//                ans1 = newNode
//                l = l.next
//                r = r.next
//            }
//        }
//
//        while (l!=null){
//            var sum = l.`val` + plus
//            if (sum>=10) {
//                plus = 1
//                val newNode = ListNode(sum % 10)
//                ans1!!.next = newNode
//                ans1 = newNode
//                l = l.next
//            }else {
//                plus = 0
//                val newNode = ListNode(sum)
//                ans1!!.next = newNode
//                ans1 = newNode
//                l = l.next
//            }
//        }
//
//        while (r!=null){
//            var sum = r.`val` + plus
//            if (sum>=10) {
//                plus = 1
//                val newNode = ListNode(sum % 10)
//                ans1!!.next = newNode
//                ans1 = newNode
//                r = r.next
//            }else {
//                plus = 0
//                val newNode = ListNode(sum)
//                ans1!!.next = newNode
//                ans1 = newNode
//                r = r.next
//            }
//        }
//
//        if (plus == 1){
//            val newNode = ListNode(1)
//            ans1!!.next = newNode
//            ans1 = newNode
//        }
//        return ans
//
//    }
}