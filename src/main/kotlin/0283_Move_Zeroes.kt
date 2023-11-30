class Solution0283 {
    fun moveZeroes(nums: IntArray): Unit {
        if (nums.size == 1){
            return
        }

        var i = 1
        var j = 0

        while (i != nums.size){
            if (nums[i] != 0 && nums[j] == 0){
                var temp = nums[i]
                nums[i] = nums[j]
                nums[j] = temp
                j++
            }else if (nums[j] != 0){
                j++
            }
            i++
        }
    }
}