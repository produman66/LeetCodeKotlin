class Solution0287 {
    var li = ListNode(5)
    var v = li.`val`
    class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }


    fun findDuplicate(nums: IntArray): Int {

        var list = ListNode(nums[0])
        var ans = list
        var n = 1


        while (n!=nums.size){
            val newList = ListNode(nums[n])
            ans.next = newList
            ans = newList
            n++
        }
        ans.next = list

        var l = list
        var r = list

        while (true){
            if (r!!.`val` == l.`val` && r != l){
                return r.`val`
            }else {
                r = r.next!!.next!!
                l = l.next!!
            }
        }
    }
}