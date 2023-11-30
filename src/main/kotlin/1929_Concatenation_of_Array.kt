class Solution1929 {
    fun getConcatenation(nums: IntArray): IntArray {

        val n = nums.size
        val ans = IntArray(2*n)
        //1 2 1
        //1 2 1 1 2 2
        for (i in 0 until n){
            ans[i] = nums[i]
            ans[i+n] = nums[i]
        }
        return ans
    }
}