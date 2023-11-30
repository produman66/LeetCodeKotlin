package Arrays_and_Hashing

class Solution0169 {
    fun majorityElement(nums: IntArray): Int {
        val map = mutableMapOf<Int, Int>()

        for (i in 0 until nums.size){
            if (!map.containsKey(nums[i])){
                map[nums[i]] = 0
            }
            map[nums[i]] =  map[nums[i]]!! + 1
        }

        return map.maxByOrNull { it.value }!!.key
    }
}