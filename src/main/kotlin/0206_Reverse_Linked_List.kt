
class Solution0206 {
    fun reverseList(head: MyHashSet.ListNode?): MyHashSet.ListNode? {
        var prev: MyHashSet.ListNode? = null
        var cur = head

        while (cur != null){
            val nxt = cur.next
            cur.next = prev
            prev = cur
            cur = nxt
        }
        return prev
    }
}