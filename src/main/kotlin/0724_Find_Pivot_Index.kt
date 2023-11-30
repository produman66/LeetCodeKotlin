class Solution0724 {
    fun pivotIndex(nums: IntArray): Int {

        // 1,7,3,6,5,6

        var sum = 0 // 28
        for (i in 0 until nums.size) sum += nums[i]

        var l = 0 // 3

        var sumL = 0 // 11
        var sumR = sum - nums[l] //16

        while (l < nums.size-1){
            if (sumL == sumR) return l
            sumL += nums[l]
            l++
            sumR -= nums[l]
        }
        if (sumL == sumR) return l

        return -1
    }

}