class Solution2215 {
    fun findDifference(nums1: IntArray, nums2: IntArray): List<List<Int>> {
        var set1 = mutableSetOf<Int>()
        var set2 = mutableSetOf<Int>()

        var ans = mutableListOf<MutableList<Int>>()

        for (i in 0 until nums1.size){
            if (nums1[i] !in set1){
                set1.add(nums1[i])
            }
        }

        for (i in 0 until nums2.size){
            if (nums2[i] !in set2){
                set2.add(nums2[i])
            }
        }

        var ans1 = mutableSetOf<Int>()
        var ans2 = mutableSetOf<Int>()

        for (i in 0 until nums1.size){
            if (nums1[i] !in set2 && nums1[i] !in ans1){
                ans1.add(nums1[i])
            }
        }

        for (i in 0 until nums2.size){
            if (nums2[i] !in set1 && nums2[i] !in ans2){
                ans2.add(nums2[i])
            }
        }

        ans.add(ans1.toMutableList())
        ans.add(ans2.toMutableList())

        return ans.toList()
    }
}