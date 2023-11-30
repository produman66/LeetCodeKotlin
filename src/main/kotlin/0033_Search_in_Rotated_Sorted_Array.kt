class Solution0033 {
    fun search(nums: IntArray, target: Int): Int {
        var r = nums.size-1
        var l = 0

        while (l <= r){

            var m = l + (r - l) / 2
            if (nums[m] == target) return m

            if (nums[m] >= nums[l]){
                if (nums[m] < target || target < nums[l]) l = m+1
                else r = m-1
            }else{
                if (nums[m] > target || target > nums[r]) r = m-1
                else l = m+1
            }

        }
        return -1
    }
}