import java.lang.Integer.max
import java.lang.Integer.min

class Solution0042 {
    fun trap(height: IntArray): Int {
        var maxLeft = mutableListOf<Int>(0)
        var maxRigth = mutableListOf<Int>(0)
        var minArr = mutableListOf<Int>()
        val copyHeight = height.toMutableList()
        val reversedHeight = copyHeight.reversed().toMutableList()
        copyHeight.add(0, 0)
        reversedHeight.add(0, 0)

        var counter = 0;
        for (i in 1 until copyHeight.size - 1) {
            maxLeft.add(max(maxLeft[i - 1], copyHeight[i]))
        }
        for (i in 1 until copyHeight.size - 1) {
            maxRigth.add(max(maxRigth[i - 1], reversedHeight[i]))
        }
        var maxRigth1 = maxRigth.reversed()
        for (i in 0 until height.size) {
            minArr.add(min(maxLeft[i], maxRigth1[i]))
            var sum = minArr[i] - height[i]
            if (sum > 0) {
                counter += sum
            }
        }
        return counter


    }
}