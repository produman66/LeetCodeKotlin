class Solution0084 {
    fun largestRectangleArea(heights: IntArray): Int {
        val stack = mutableListOf<Int>()
        var maxsum = 0
        for (i in 0 until heights.size) {
            while (stack.isNotEmpty() && heights[i] < heights[stack.last()]) {
                val height = heights[stack.removeAt(stack.lastIndex)]
                var width=0
                if (stack.isEmpty()){
                    width = i
                }else {
                    width = i - stack.last() - 1
                }
                maxsum = maxOf(maxsum, height * width)
            }
            stack.add(i)
        }
        while (stack.isNotEmpty()) {
            val height = heights[stack.removeAt(stack.lastIndex)]
            val width = if (stack.isEmpty()) heights.size else heights.size - stack.last() - 1
            maxsum = maxOf(maxsum, height * width)
        }
        return maxsum
    }
}