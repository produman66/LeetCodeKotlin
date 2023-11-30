import java.lang.Integer.min

class Solution0153 {
    fun findMin(nums: IntArray): Int {
        var l = 0;
        var r = nums.size-1
        var ans = nums[0]
        while (l <= r){
            if (nums[l] < nums[r]){
                ans = min(nums[l], ans)
                break
            }
            var m = (l + r) / 2
            ans = min(ans, nums[m])
            if (nums[m] >= nums[l]){
                l = m + 1
            }else {
                r = m - 1
            }
        }
        return ans

    }
}