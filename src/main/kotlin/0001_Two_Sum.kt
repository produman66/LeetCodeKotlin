class Solution0001 {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val ans = mutableListOf<Int>()
        val sets = mutableMapOf<Int, Int>()
        for (i in 0 until  nums.size){
            if (target - nums[i] in sets){
                ans.add(i)
                ans.add(sets[target - nums[i]]!!.toInt())
            }else {
                sets[nums[i]] = i
            }
        }
        return ans.toIntArray()
    }
}