class Solution1343 {
    fun numOfSubarrays(arr: IntArray, k: Int, threshold: Int): Int {
        var sum = 0
        var count = 0

        var i = 0
        var j = 0
        while (i < arr.size){
            if (i - j == k){

                if (sum / k >= threshold) count ++

                sum -= arr[j]
                j++
                sum+=arr[i]
                i++
            }
            else {
                sum += arr[i]
                i++
            }
        }
        if (sum / k >= threshold) count ++
        return count
    }
}