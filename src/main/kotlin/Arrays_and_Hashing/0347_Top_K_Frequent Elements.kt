package Arrays_and_Hashing

class Solution0347 {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val ans = IntArray(k)
        val mp = mutableMapOf<Int, Int>()
        val maxx = 0
        var k1 = k
        for (i in 0 until nums.size){
            if (nums[i] !in mp){
                mp[nums[i]] = 1
            }else {
                mp[nums[i]] = mp[nums[i]]!!+ 1
            }
        }
        while (k1!=0){
            val keyWithMaxValue = mp.maxByOrNull { it.value }?.key
            ans[k-k1] = keyWithMaxValue!!
            mp.remove(keyWithMaxValue)
            k1-=1
        }
        return ans
    }
}