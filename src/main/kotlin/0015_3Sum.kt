class Solution0015 {
    fun threeSum(nums: IntArray): List<List<Int>> {
        var ans = mutableListOf<List<Int>>()
        var nums1 = nums.sorted()
        for (i in 0 until nums1.size) {
            if (i > 0 && nums1[i] == nums1[i-1]) continue
            var l = i + 1
            var r = nums1.size - 1
            while (l < r) {
                val target = nums1[i] + nums1[r] + nums1[l];
                if (target > 0){
                    r--
                }else if (target < 0){
                    l++
                }else {
                    var ans1 = mutableListOf<Int>()
                    ans1.add(nums1[i])
                    ans1.add(nums1[r])
                    ans1.add(nums1[l])
                    ans.add(ans1)
                    l++
                    while (nums1[l] == nums1[l-1] && l < r){
                        l++
                    }
                }
            }
        }
        return ans
    }
}