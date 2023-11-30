class Solution0496 {
    fun nextGreaterElement(nums1: IntArray, nums2: IntArray): IntArray {

        val ans = mutableListOf<Int>()

        for (i in 0 until nums1.size){

            var min:Int? = null
            var flag = false
            for (j in 0 until nums2.size){
                if (nums1[i] == nums2[j]){
                    min = nums1[i]
                }
                if (min!=null){
                    if (nums2[j] > min){
                        ans.add(nums2[j])
                        flag = true
                        break
                    }
                }
            }
            if (!flag){
                ans.add(-1)
            }
        }
        return ans.toIntArray()
    }
}