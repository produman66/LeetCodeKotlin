class Solution0088 {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
        var num = mutableListOf<Int>()
        for (i in 0 until m){
            num.add(nums1[i])
        }

        var i = 0
        var j = 0
        var k = 0

        while (j < num.size && k < nums2.size){
            if (num[j] <= nums2[k]){
                nums1[i] = num[j]
                j++
            }else {
                nums1[i] = nums2[k]
                k++
            }
            i++
        }

        while (j < num.size){
            nums1[i] = num[j]
            j++
            i++
        }

        while (k < nums2.size){
            nums1[i] = nums2[k]
            k++
            i++
        }
    }
}