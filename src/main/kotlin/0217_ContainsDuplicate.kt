class Solution {
    fun containsDuplicate(nums: IntArray): Boolean {
        val hashSet: HashSet<Int> = HashSet()
        for (i in 0 until nums.size){
            if (nums[i] in hashSet){
                return true
            }else {
                hashSet.add(nums[i])
            }
        }
        return false
    }
}