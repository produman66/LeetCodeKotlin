class Solution0011 {
    fun maxArea(height: IntArray): Int {
        var max = 0
        var l = 0
        var r = height.size-1
        while (l != r){
            if (height[l] > height[r]){
                val sum = height[r] * (r-l)
                if (sum > max){
                    max = sum
                }
                r--
            }else {
                val sum = height[l] * (r-l)
                if (sum > max){
                    max = sum
                }
                l++
            }
        }
        return max
    }
}