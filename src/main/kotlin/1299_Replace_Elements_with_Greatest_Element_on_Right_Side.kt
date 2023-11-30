class Solution1299 {

    // 18 6  6  6  1  -1 ans
    //17 18 5 4 6 1 arr

    fun replaceElements(arr: IntArray): IntArray {
        val ans = IntArray(arr.size)

        if (arr.size == 1){
            ans[0] = -1
            return ans
        }
        ans[arr.size - 1] = -1
        for (i in arr.size - 1 downTo 1) {
            if (arr[i] > ans[i]){
                ans[i-1] = arr[i]
            }else {
                ans[i-1] = ans[i]
            }
        }
        return ans
    }
}