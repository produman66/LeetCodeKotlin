class Solution0739 {
    fun dailyTemperatures(temperatures: IntArray): IntArray {
        val stack = mutableListOf<Int>()
        val ans = IntArray(temperatures.size) { 0 }
        for (i in temperatures.indices) {
            while (stack.isNotEmpty() && temperatures[i] > temperatures[stack.last()]) {
                val last = stack.removeAt(stack.lastIndex)
                ans[last] = i - last
            }
            stack.add(i)
        }
        return ans
    }
}