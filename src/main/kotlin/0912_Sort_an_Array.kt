class Solution0912 {
    fun sortArray(nums: IntArray): IntArray {
        mergeSort(nums, 0, nums.size-1)
        return nums
    }
    fun mergeSort(nums:IntArray, left: Int, right: Int){
        if (left == right){
            return
        }
        val mid = (right + left) / 2
        mergeSort(nums, left, mid)
        mergeSort(nums, mid+1, right)
        merge(nums, left, mid, right)
        return
    }
    fun merge(nums:IntArray, left: Int, mid: Int, right: Int){
        val leftP = nums.copyOfRange(left, mid+1)
        val rightP = nums.copyOfRange(mid+1, right+1)
        var i = left
        var j = 0
        var k = 0

        while (j < leftP.size && k < rightP.size){
            if (leftP[j] <= rightP[k]){
                nums[i] = leftP[j]
                j++
            }else {
                nums[i] = rightP[k]
                k++
            }
            i++
        }

        while (j < leftP.size){
            nums[i] = leftP[j]
            j++
            i++
        }

        while (k < rightP.size){
            nums[i] = rightP[k]
            k++
            i++
        }
    }
}

