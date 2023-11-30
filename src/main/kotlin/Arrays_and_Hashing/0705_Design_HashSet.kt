package Arrays_and_Hashing

class MyHashSet() {

    class ListNode(val `val`: Int?){
        var next: ListNode? = null
    }

    val set = Array(100000){ ListNode(null) }

    fun add(key: Int) {
        var cur = set[code(key)]
        if (cur.`val` == key) return
        while (cur?.next != null) {
            if (cur?.next?.`val` == key)
                return
            cur = cur?.next!!
        }

        cur.next = ListNode(key)
    }

    fun remove(key: Int) {

        var cur = set[code(key)]

        while (cur?.next != null) {
            if (cur?.next?.`val` == key)
                cur?.next = cur.next?.next
            return
            cur = cur?.next!!
        }

    }

    fun contains(key: Int): Boolean {
        var cur = set[code(key)]

        while (cur?.next != null) {
            if (cur?.next?.`val` == key)
                return true
            cur = cur?.next!!
        }
        return false
    }

    fun code(key: Int):Int{
        return key % set.size
    }

}

/**
 * Your Arrays_and_Hashing.MyHashSet object will be instantiated and called as such:
 * var obj = Arrays_and_Hashing.MyHashSet()
 * obj.add(key)
 * obj.remove(key)
 * var param_3 = obj.contains(key)
 */