package Arrays_and_Hashing

class Solution0075 {
    fun sortColors(nums: IntArray): Unit {
        val size = nums.size
        var ans = IntArray(size)
        var k = 0
        var j = size - 1

        for (i in 0 until size){
            ans[i] = 1
        }

        for (i in 0 until size){
            if (nums[i] == 2){
                ans[j] = 2
                j--
            }else if (nums[i] == 0){
                ans[k] = 0
                k++
            }
        }
        for (i in 0 until size){
            nums[i] = ans[i]
        }

    }

}