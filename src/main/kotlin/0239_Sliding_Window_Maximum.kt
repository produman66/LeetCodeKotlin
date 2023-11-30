class Solution0239 {
    fun maxSlidingWindow(nums: IntArray, k: Int): IntArray {

        if (k == 1){
            return nums
        }

        var max = 0
        var index = 0

        var l = 0
        var ans = mutableListOf<Int>()

        for (r in 0 until nums.size){
            if (r - l < k){
                if (max <= nums[r]){
                    max = nums[r]
                    index = r
                }
            }else if (nums[r] > max){
                max = nums[r]
                index = r
                l++
            }else if (nums[r] < max && index - l >= 1){
                l++
            }else{
                max = -100000
                for (t in l+1 .. r){
                    if (max <= nums[t]){
                        max = nums[t]
                        index = t
                    }
                }
                l++
            }
            if (r - l == k-1){
                ans.add(max)
            }
        }
//        for (i in 0 until ans.size){
//            println(ans[i])
//        }
        return ans.toIntArray()
    }
}