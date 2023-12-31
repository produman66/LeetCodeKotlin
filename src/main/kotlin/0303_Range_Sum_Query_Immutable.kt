class NumArray(nums: IntArray) {
    val summ = mutableListOf<Int>()
    var sum = 0

    init {
        for (i in 0 until nums.size){
            sum += nums[i]
            summ.add(sum)
        }
    }



    fun sumRange(left: Int, right: Int): Int {
        if (left == 0){
            return summ[right]
        }
        return summ[right] - summ[left-1]
    }

}

/**
 * Your NumArray object will be instantiated and called as such:
 * var obj = NumArray(nums)
 * var param_1 = obj.sumRange(left,right)
 */