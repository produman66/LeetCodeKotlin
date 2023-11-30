import java.lang.Integer.max
import java.util.*

class Solution0128 {
    fun longestConsecutive(nums: IntArray): Int {
        val mp = TreeSet<Int>()
        for (i in 0 until nums.size){
            mp.add(nums[i])
        }
        var maxlen = 0
        var len = 0
        val iterator = mp.iterator()
        var element1: Int
        var element2: Int? = null
        while (iterator.hasNext()) {
            element1 = iterator.next()
            if (element2 != null && element1 - element2 == 1) {
                len += 1
            } else {
                maxlen = max(maxlen, len)
                len = 1
            }
            element2 = element1
        }
        maxlen = max(maxlen, len)

        return maxlen
    }
}